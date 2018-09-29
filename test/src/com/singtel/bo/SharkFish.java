package com.singtel.bo;

import com.singtel.IEatBeaviour;
import com.singtel.impl.EatFishBeahivaourImpl;

public class SharkFish extends Fish{

	IEatBeaviour eatFishBehaviour;
	public SharkFish() {
		eatFishBehaviour = new EatFishBeahivaourImpl();
		this.color = "GREY";
		this.size = "LARGE";		
	}
	
	public void eat() {
		eatFishBehaviour.eat();
	}
}
