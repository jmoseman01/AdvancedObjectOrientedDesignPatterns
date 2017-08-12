package com.ood.uno;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	//this makes sure that you can not construct this object
	//you can only use getInstance()
	private SingleObject() {}
	
	public static SingleObject getInstance() 
	{
		return instance;
	}
	
	public void showMessage() 
	{
		System.out.println("Hello World!");
	}
}
