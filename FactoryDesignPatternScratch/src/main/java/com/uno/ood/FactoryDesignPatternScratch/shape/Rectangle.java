package com.uno.ood.FactoryDesignPatternScratch.shape;

import com.uno.ood.FactoryDesignPatternScratch.interfaces.Shape;

public class Rectangle implements Shape {

	public void draw() {
		System.out.println("ran Rectangle::draw()");
	}

}
