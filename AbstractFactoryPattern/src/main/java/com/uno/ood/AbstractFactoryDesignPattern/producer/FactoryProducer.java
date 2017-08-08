package com.uno.ood.AbstractFactoryDesignPattern.producer;

import com.uno.ood.AbstractFactoryDesignPattern.factories.AbstractFactory;
import com.uno.ood.AbstractFactoryDesignPattern.factories.ColorFactory;
import com.uno.ood.AbstractFactoryDesignPattern.factories.ShapeFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(String typeOfFactory)
	{
		if(typeOfFactory == null)
		{
			return null;
		}
		else if(typeOfFactory.toLowerCase().equals("shape"))
		{
			return new ShapeFactory();
		}
		else if(typeOfFactory.toLowerCase().equals("color"))
		{
			return new ColorFactory();
		}
		return null;
		
	}

}
