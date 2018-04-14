package com.song.dubbo.dubbo_demo_api;

import java.io.Serializable;
import java.util.List;

public interface CallbackListener extends Serializable{

	public void callBack(List<String> list);
}
