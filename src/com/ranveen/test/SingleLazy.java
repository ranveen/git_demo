package com.ranveen.test;

public class SingleLazy {
	private static SingleLazy single = new SingleLazy();
	private SingleLazy(){}
	public SingleLazy getInstance(){
		return single;
	}
}
