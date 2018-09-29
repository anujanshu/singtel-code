package com.singtel.bo;

import com.singtel.IFly;
import com.singtel.ISing;
import com.singtel.ISwimBehaviour;
import com.singtel.IWalk;
import com.singtel.impl.NoSingBehaviourImpl;
import com.singtel.impl.NoWalkBehaviour;
import com.singtel.impl.SwimBeaviourImpl;

public class Fish extends Animal{
	
	String size;
	String color;
	
	ISwimBehaviour iSwimBehaviour;
	IWalk walkBehaviour;
	ISing singBehaviour;
	
	public Fish() {
		iSwimBehaviour = new SwimBeaviourImpl();
		walkBehaviour = new NoWalkBehaviour();
		singBehaviour = new NoSingBehaviourImpl();
	}
	
	public void sing() {
		singBehaviour.sing();
	}
	
	@Override
	public void walk() {
		// Fish overriding the beahviour of anilmal with their specific behaviour
		walkBehaviour.walk();
	}
	public void swim() {
		iSwimBehaviour.swim();
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void display() {
		System.out.println("Size:" + size);
		System.out.println("Colour:" + color);
	}
}
