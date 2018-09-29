package com.singtel.impl;

import com.singtel.ISound;

public class NoSoundImpl implements ISound{

	@Override
	public void sound() {
		System.out.println("I do not make sound");
	}
}
