package com.uno.ood.AbstractFactoryDesignPattern.main;

import com.uno.ood.AbstractFactoryDesignPattern.factories.AbstractFactory;
import com.uno.ood.AbstractFactoryDesignPattern.producer.FactoryProducer;

public class Main {
	public static void main(String args[])
	{
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		String[] shapes={"circle","square","rectangle"};
		
		for(int i=0;i<shapes.length;i++)
		{
			shapeFactory.getShape(shapes[i]).draw();
		}

		//create colors factory
		//traverse colors and use polymorphism to use fill
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		String[] colors={"red","green","blue"};
		for(int i=0;i<colors.length;i++)
		{
			colorFactory.getColor(colors[i]).fill();
		}
	}
}
