package com.song.dubbo.dubbo_demo_comsumer.notify;

import java.util.List;

public interface Notify {
	 // 调用之前
	 void oninvoke(Object... obj); 
	 // 调用之后
	 void onreturn(List<String> result,Object... obj); 
	 // 出现异常
	 void onthrow(Throwable ex, Object... obj);  
}
