package com.singtel.impl;

import com.singtel.ISpeak;

public class SpeakImpl implements ISpeak {
	@Override
	public void speak() {
		System.out.println("I can speak");
	}
}
