package com.uno.ood.FactoryDesignPatternScratch.shape;

import com.uno.ood.FactoryDesignPatternScratch.interfaces.Shape;

public class Square implements Shape {

	public void draw() {
		System.out.println("ran Square::draw()");
	}

}
