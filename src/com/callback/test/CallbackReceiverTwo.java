package com.callback.test;

public class CallbackReceiverTwo implements CallbackInterfce{
	public void onChange(int mValue){
		System.out.println("Hey the new value inside Two is: "+mValue);
	}
}
