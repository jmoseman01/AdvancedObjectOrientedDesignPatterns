package com.uno.ood.FactoryDesignPatternScratch.main;

import com.uno.ood.FactoryDesignPatternScratch.factory.ShapeFactory;
import com.uno.ood.FactoryDesignPatternScratch.interfaces.Shape;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		//construct shape factory
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//use shape factory to construct and draw all three shapes
		
		String[] shapes={"Circle","Rectangle","Square"};
		
		for(int i=0;i<shapes.length;i++)
		{
			String shapeType = shapes[i];
			Shape shape = shapeFactory.getShape(shapeType);
			shape.draw();
		}
	}

}
