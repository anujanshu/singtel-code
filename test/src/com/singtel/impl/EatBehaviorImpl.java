package com.singtel.impl;

import com.singtel.IEatBeaviour;

public class EatBehaviorImpl implements IEatBeaviour {
	@Override
	public void eat() {
		System.out.println("I can eat");
	}
}
