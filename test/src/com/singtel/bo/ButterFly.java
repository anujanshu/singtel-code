package com.singtel.bo;

import com.singtel.IFly;
import com.singtel.ISound;
import com.singtel.impl.FlyImpl;
import com.singtel.impl.NoSoundImpl;

public class ButterFly extends Animal{

	IFly iFlyBehaviour;
	ISound iSoundBehaviour;
	
	public ButterFly() {
		iFlyBehaviour =new FlyImpl();
		iSoundBehaviour = new NoSoundImpl();
	}
	
	public void fly() {
		iFlyBehaviour.fly();
	}
	public void sound() {
		iSoundBehaviour.sound();
	}
}
