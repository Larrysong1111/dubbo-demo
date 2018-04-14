package com.song.dubbo.dubbo_demo_provider;

import java.util.ArrayList;
import java.util.List;

import com.song.dubbo.dubbo_demo_api.CallbackListener;
import com.song.dubbo.dubbo_demo_api.UserService;

 

public class UserServiceImpl implements UserService {

	/**
	 * 
	 * <p>生成数据</p> 
	 * @author 18715
	 * @date 2018年4月13日 下午4:52:09
	 * @return
	 * @see
	 */
	private List<String> generateData() {
		List<String> namelist = new ArrayList<String>();
		namelist.add("song");
		namelist.add("xiao");
		namelist.add("lin");
		System.out.println("成功调用");
		return namelist;
	}
	/**
	 * 
	 * <p>同步接口</p> 
	 * @author 18715
	 * @date 2018年3月22日 下午4:30:50
	 * @return
	 * @see
	 */
	public List<String> getUsers() {
		return generateData();
	}
	/**
	 * 
	 * <p>异步接口--通知</p> 
	 * @author 18715
	 * @date 2018年4月14日 上午11:22:03
	 * @param str
	 * @return 
	 * @see com.song.dubbo.dubbo_demo_api.UserService#getAsynUsersNotify(java.lang.String)
	 */
	public List<String> getAsynUsersNotify(String str) {
		System.out.println("入参为："+str);
		int i = 10/0;
		return generateData();
	}
	/**
	 * 
	 * <p>异步接口--回调</p> 
	 * @author 18715
	 * @date 2018年4月14日 上午11:26:22
	 * @param str
	 * @return 
	 * @see com.song.dubbo.dubbo_demo_api.UserService#getAsynUsersCallback(java.lang.String)
	 */
	public List<String> getAsynUsersCallback(String str,CallbackListener callbackListener) {
		System.out.println("入参为："+str);
		List<String> generateData = generateData();
		callbackListener.callBack(generateData);
		return generateData;
	}
	/**
	 * 
	 * <p>异步接口---future</p> 
	 * @author 18715
	 * @date 2018年4月14日 下午2:37:06
	 * @param str
	 * @return 
	 * @see com.song.dubbo.dubbo_demo_api.UserService#getAsynUsersFuture(java.lang.String)
	 */
	public List<String> getAsynUsersFuture(String str) {
		System.out.println("入参为："+str);
		return generateData();
	}
	
	 
}
