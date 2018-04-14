package com.song.dubbo.dubbo_demo_api;

import java.util.List;

public interface UserService {
	 //同步接口
	 List<String> getUsers();
	 //异步接口---future
	 List<String> getAsynUsersFuture(String str);
	 //异步接口---通知
	 List<String> getAsynUsersNotify(String str);
	 //异步接口---回调
	 List<String> getAsynUsersCallback(String str,CallbackListener callbackListener);
}
