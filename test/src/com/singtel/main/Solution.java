package com.singtel.main;

import com.singtel.bo.Bird;
import com.singtel.bo.Chicken;
import com.singtel.bo.Duck;

public class Solution {
	
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.doSpeak();
		duck.doSwim();
		
		Chicken chicken = new Chicken();
		chicken.doSpeak();
		chicken.fly();
	}
}
