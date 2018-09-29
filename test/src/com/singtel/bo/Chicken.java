package com.singtel.bo;

import com.singtel.IFly;
import com.singtel.ISpeak;
import com.singtel.impl.ChickenSpeakImpl;
import com.singtel.impl.NoWingFlyImpl;

public class Chicken extends Bird{

	ISpeak speakBehaviour;
	IFly flyBehaviour;
	
	public Chicken() {
		speakBehaviour = new ChickenSpeakImpl();
		flyBehaviour = new NoWingFlyImpl();
	}
	
	@Override
	public void fly() {
		flyBehaviour.fly();
	}
	
	public void doSpeak() {
		speakBehaviour.speak();
	}
}
