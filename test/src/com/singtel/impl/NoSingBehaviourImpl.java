package com.singtel.impl;

import com.singtel.ISing;

public class NoSingBehaviourImpl implements ISing {

	@Override
	public void sing() {
		System.out.println("I can not Sing");
	}
}
