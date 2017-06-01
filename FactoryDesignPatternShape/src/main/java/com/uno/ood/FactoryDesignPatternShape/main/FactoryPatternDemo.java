package com.uno.ood.FactoryDesignPatternShape.main;

import com.uno.ood.FactoryDesignPatternShape.factory.ShapeFactory;
import com.uno.ood.FactoryDesignPatternShape.shape.Shape;

public class FactoryPatternDemo
{
	/**
	 * Execute each shapes draw method based on 
	 * the parameter
	 * @param args
	 */
	public static void main(String[] args)
	{
		//construct shape factory
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//get circle and run draw function
		Shape circle = shapeFactory.getShape("Circle");
		circle.draw();

		//get rectangle and run draw function
		Shape rectangle = shapeFactory.getShape("Rectangle");
		rectangle.draw();

		//get square and run draw function
		Shape square = shapeFactory.getShape("Square");
		square.draw();

	}

}
