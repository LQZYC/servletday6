package cn.itcast.servletday6.chat.dto;

import cn.itcast.servletday6.domain.User;
import sun.security.jca.GetInstance;

import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;
import java.io.*;
import java.util.HashMap;

/**
 * User %{USER}
 * Date %{DATE}
 * Time %{TIME}
 */
public class UserDao {
    private UserDao(){};
    private static   ServletContext servletContext = null;
    private static  UserDao instance = new UserDao();
    public static UserDao getInstance(ServletContext se){
        servletContext = se;
        return instance;
    }
    public static UserDao getInstance(){
        return instance;
    }
    HashMap<String,User> users = new HashMap<String,User>();
    public  void addUser(User user){
        users.put(user.getName(),user);
    }
    public  User findByName(String name){
        return  users.get(name);
    }
    public void getDB() throws Exception {
        FileInputStream fileInputStream = new FileInputStream(servletContext.getContextPath()+"/WEB-INF/USERDB.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        users = (HashMap<String, User>) objectInputStream.readObject();
        objectInputStream.close();
    }
    public void store() throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream(servletContext.getContextPath()+"/WEB-INF/USERDB.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(users);
        objectOutputStream.close();
    }
}
