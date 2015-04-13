package cn.itcast.servletday6.listeners;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * User %{USER}
 * Date %{DATE}
 * Time %{TIME}
 */
public class MyBean implements HttpSessionBindingListener,HttpSessionActivationListener,Serializable{

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("被绑定到session"+httpSessionBindingEvent.getName());
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent) {
        System.out.println("被解除绑定到session"+httpSessionBindingEvent.getName());
    }

    @Override
    public void sessionWillPassivate(HttpSessionEvent httpSessionEvent) {
        System.out.println("session写入硬盘");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent httpSessionEvent) {
        
        System.out.println("起来了起来了");
        System.out.println("硬盘恢复到内存session");

    }
}
