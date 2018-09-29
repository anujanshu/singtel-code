package com.singtel.impl;

import com.singtel.IFly;

public class NoWingFlyImpl implements IFly{

	@Override
	public void fly() {
		System.out.println("I can not Fly");
	}
}
