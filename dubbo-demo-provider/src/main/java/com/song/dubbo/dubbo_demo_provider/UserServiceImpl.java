package com.song.dubbo.dubbo_demo_provider;

import java.util.ArrayList;
import java.util.List;

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
		namelist.add("song"+System.currentTimeMillis());
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
	
	 
}
