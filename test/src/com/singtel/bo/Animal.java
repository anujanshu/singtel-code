package com.singtel.bo;

import com.singtel.IWalk;
import com.singtel.impl.WalkImpl;

public class Animal {
	IWalk walkBehaviour;
	public Animal() {
		walkBehaviour = new WalkImpl();
	}
	public void walk() {
		walkBehaviour.walk();
	}
}
