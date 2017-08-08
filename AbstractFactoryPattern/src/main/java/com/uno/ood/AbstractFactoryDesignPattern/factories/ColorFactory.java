package com.uno.ood.AbstractFactoryDesignPattern.factories;

import com.uno.ood.AbstractFactoryDesignPattern.color.Blue;
import com.uno.ood.AbstractFactoryDesignPattern.color.Green;
import com.uno.ood.AbstractFactoryDesignPattern.color.Red;
import com.uno.ood.AbstractFactoryDesignPattern.interfaces.Color;
import com.uno.ood.AbstractFactoryDesignPattern.interfaces.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if(color == null)
		{
			return null;
		}
		else if(color.toLowerCase().equals("red"))
		{
			return new Red();
		}
		else if(color.toLowerCase().equals("green"))
		{
			return new Green();
		}
		else if(color.toLowerCase().equals("blue"))
		{
			return new Blue();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
