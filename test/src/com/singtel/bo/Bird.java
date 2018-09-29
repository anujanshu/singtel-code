package com.singtel.bo;

import com.singtel.IFly;
import com.singtel.ISing;
import com.singtel.impl.FlyImpl;
import com.singtel.impl.SingImpl;

public class Bird extends Animal{
	
	ISing singBehaviour;
	IFly flyBehaviour;
	
	public Bird() {
		singBehaviour = new SingImpl();
		flyBehaviour = new FlyImpl();
	}
	public void fly() {
		flyBehaviour.fly();
	}
	public void sing() {
		singBehaviour.sing();
	}
}
