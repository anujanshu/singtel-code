package com.singtel.bo;

import com.singtel.ISpeak;
import com.singtel.ISwimBehaviour;
import com.singtel.impl.DuckSpeakImpl;
import com.singtel.impl.SwimBeaviourImpl;

public class Duck extends Bird {

	ISpeak speakBehaviour;
	ISwimBehaviour swimBehaviourImpl;
	public Duck(){
		speakBehaviour = new DuckSpeakImpl();
		swimBehaviourImpl = new SwimBeaviourImpl();
	}
	
	public void doSpeak() {
		speakBehaviour.speak();
	}
	
	public void doSwim() {
		swimBehaviourImpl.swim();
	}
}
