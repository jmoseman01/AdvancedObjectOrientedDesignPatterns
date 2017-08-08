package com.uno.ood.AbstractFactoryDesignPattern.factories;

import com.uno.ood.AbstractFactoryDesignPattern.interfaces.Color;
import com.uno.ood.AbstractFactoryDesignPattern.interfaces.Shape;
import com.uno.ood.AbstractFactoryDesignPattern.shape.Circle;
import com.uno.ood.AbstractFactoryDesignPattern.shape.Rectangle;
import com.uno.ood.AbstractFactoryDesignPattern.shape.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		if(shape == null)
		{
			return null;
		}
		else if(shape.toLowerCase().equals("square"))
		{
			return new Square();
		}
		else if(shape.toLowerCase().equals("circle"))
		{
			return new Circle();
		}
		else if(shape.toLowerCase().equals("rectangle"))
		{
			return new Rectangle();
		}
		// TODO Auto-generated method stub
		return null;
	}

}
