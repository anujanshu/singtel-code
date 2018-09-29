package com.singtel.decorator.impl;

import com.singtel.bo.Chicken;
/**
 * Rooster are the male chickens.
 * @author Anuj Tomar
 *
 */
public class RoosterDecorator extends ChickenDecorator{
	Chicken chicken;
	boolean isMale = true;
	
	public RoosterDecorator() {
		chicken = new Chicken();
	}
	@Override
	public void doSpeak() {
		System.out.println("Cock-a-doodle-doo");
	}
}
