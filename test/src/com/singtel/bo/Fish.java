package com.singtel.bo;

import com.singtel.IFly;
import com.singtel.ISing;
import com.singtel.ISwimBehaviour;
import com.singtel.IWalk;
import com.singtel.impl.NoSingBehaviourImpl;
import com.singtel.impl.NoWalkBehaviour;
import com.singtel.impl.SwimBeaviourImpl;

public class Fish extends Animal{

	ISwimBehaviour iSwimBehaviour;
	IWalk walkBehaviour;
	ISing singBehaviour;
	
	public Fish() {
		iSwimBehaviour = new SwimBeaviourImpl();
		walkBehaviour = new NoWalkBehaviour();
		singBehaviour = new NoSingBehaviourImpl();
	}
	
	public void sing() {
		singBehaviour.sing();
	}
	
	@Override
	public void walk() {
		// Fish overriding the beahviour of anilmal with their specific behaviour
		walkBehaviour.walk();
	}
	public void swim() {
		iSwimBehaviour.swim();
	}
}
