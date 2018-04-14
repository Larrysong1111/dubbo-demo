package com.song.dubbo.dubbo_demo_comsumer;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.RpcContext;
import com.song.dubbo.dubbo_demo_api.CallbackListener;
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
        //1.同步方法的调用
        List<String> users = service.getUsers();
        System.out.println("同步接口返回为："+users.size());
        //2.异步主动获取结果方式的调用
        List<String> usersFuture = service.getAsynUsersFuture("asyn+future");
        //异步返回为空
        System.out.println("异步主动获取接口直接返回为:"+usersFuture);
        //线程阻塞
        Future<Object> future = RpcContext.getContext().getFuture();
		try {
			Object object = future.get();
			System.out.println("异步主动获取接口返回为:"+object);
		} catch (InterruptedException e) {
			System.out.println("InterruptedException");
			e.printStackTrace();
		} catch (ExecutionException e) {
			System.out.println("ExecutionException");
			e.printStackTrace();
		}
		//3.异步回调的调用方式
		CallbackListener callBackService = (CallbackListener) context.getBean("callBackService");
		List<String> usersCallBack = service.getAsynUsersCallback("asyn+callback", callBackService);
        //异步返回为空
        System.out.println("异步回调直接返回为:"+usersCallBack);
		//4.异步通知接口的调用
        List<String> usersNotify = service.getAsynUsersNotify("asyn+notify");
        System.out.println("异步通知接口直接返回为："+usersNotify);
		//延迟5秒关闭
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        context.close();
    }
}
