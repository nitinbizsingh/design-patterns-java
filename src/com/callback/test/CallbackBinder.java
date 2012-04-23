package com.callback.test;

import java.util.ArrayList;

public class CallbackBinder {
	ArrayList<CallbackInterfce> a = new ArrayList<CallbackInterfce>();

	public void bindCallback(CallbackInterfce callback){
		a.add(callback);
	}

	public void dataChanged(int value){
		for(CallbackInterfce receiver : a){
			receiver.onChange(value);
		}
	}
}
