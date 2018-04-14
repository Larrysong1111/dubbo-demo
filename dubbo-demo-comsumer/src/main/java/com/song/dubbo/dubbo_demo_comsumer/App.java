package com.song.dubbo.dubbo_demo_comsumer;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.song.dubbo.dubbo_demo_api.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/dubbo-demo-consumer.xml");
        context.start();
        UserService service = (UserService) context.getBean("userService");
        List<String> users = service.getUsers();
        System.out.println(users.size());
        context.close();
    }
}
