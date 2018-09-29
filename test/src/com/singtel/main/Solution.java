package com.singtel.main;

import com.singtel.bo.Bird;
import com.singtel.bo.Chicken;
import com.singtel.bo.Duck;
import com.singtel.decorator.impl.RoosterDecorator;

public class Solution {
	
	public static void main(String[] args) {
		RoosterDecorator rooster = new RoosterDecorator();
		rooster.doSpeak();
	}
}
