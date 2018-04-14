package com.song.dubbo.dubbo_demo_comsumer.notify;

import java.util.List;

public class NotifyService implements Notify {

	public void oninvoke(Object... obj) {
		System.out.println("异步通知调用之前");
	}

	public void onreturn(List<String> result,Object... obj) {
		System.out.println("异步通知调用之后");
		System.out.println("异步通知调用之后,返回结果为："+result);
		for(Object object:obj) {
			System.out.println("异步通知调用之后,入参为："+object);
		}
	}

	public void onthrow(Throwable ex, Object... obj) {
		System.out.println("异步通知异常调用");
		System.out.println("异步通知异常调用异常为："+ex);
		for(Object object:obj) {
			System.out.println("异步通知异常调用,入参为："+object);
		}
	}

}
