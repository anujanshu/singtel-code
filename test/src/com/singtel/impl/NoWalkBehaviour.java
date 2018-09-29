package com.singtel.impl;

import com.singtel.IWalk;

public class NoWalkBehaviour implements IWalk{
	 @Override
	public void walk() {
		System.out.println("I can not walk");
	}
}
