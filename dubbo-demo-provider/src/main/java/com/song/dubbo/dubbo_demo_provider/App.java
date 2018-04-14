package com.song.dubbo.dubbo_demo_provider;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {	
    		@SuppressWarnings("resource")
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/dubbo-demo-provider.xml");
            context.start();
            System.out.println("服务已经启动...");
            System.in.read();
    	} catch (BeansException e) {
    		// TODO Auto-generated catch block
    		System.out.println("beansException");
    		e.printStackTrace();
    	} catch (IOException e) {
    		System.out.println("IOException");
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	}
    }
    
}
