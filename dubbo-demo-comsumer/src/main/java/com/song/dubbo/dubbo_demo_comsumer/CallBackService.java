package com.song.dubbo.dubbo_demo_comsumer;

import java.util.List;

import com.song.dubbo.dubbo_demo_api.CallbackListener;

public class CallBackService implements CallbackListener {

	/**
	 * TODO（用一句话描述这个变量表示什么）
	 */
	private static final long serialVersionUID = -1946497491064234032L;

	public void callBack(List<String> list) {
		// TODO Auto-generated method stub
		System.out.println("异步回调返回为:"+list);
	}

}
