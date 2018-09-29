package com.singtel.bo;

import com.singtel.ISpeak;
import com.singtel.impl.JokeBehaviour;

public class ClownFish extends Fish{

	ISpeak speakJokeBehaviour;
	public ClownFish() {
		speakJokeBehaviour = new JokeBehaviour();
		color = "ORANGE";
		size = "SMALL";
	}
	
	public void speak() {
		speakJokeBehaviour.speak();
	}
}
