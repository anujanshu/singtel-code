package com.singtel.main;

import com.singtel.bo.ClownFish;
import com.singtel.bo.SharkFish;

public class Solution {
	
	public static void main(String[] args) {
		SharkFish shark = new SharkFish();
		shark.display();
		shark.eat();
		
		ClownFish clownFish = new ClownFish();
		clownFish.speak();
		clownFish.display();
	}
}
