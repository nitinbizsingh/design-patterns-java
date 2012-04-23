package com.callback.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CallbackTest {
	public static void main(String args[]){
		CallbackBinder binder = new CallbackBinder();

		CallbackReceiverOne one = new CallbackReceiverOne();
		CallbackReceiverTwo two = new CallbackReceiverTwo();

		binder.bindCallback(one);
		binder.bindCallback(two);

		binder.dataChanged(5);

		System.out.println("Enter something here : ");
		try{
			BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			binder.dataChanged(Integer.parseInt(bufferRead.readLine()));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
