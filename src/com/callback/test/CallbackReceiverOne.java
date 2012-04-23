package com.callback.test;

public class CallbackReceiverOne implements CallbackInterfce{
	public void onChange(int mValue){
		System.out.println("Hey the new value inside One is: "+mValue);
	}
}
