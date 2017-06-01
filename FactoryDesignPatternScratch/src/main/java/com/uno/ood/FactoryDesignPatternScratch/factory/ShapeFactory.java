package com.uno.ood.FactoryDesignPatternScratch.factory;

import com.uno.ood.FactoryDesignPatternScratch.interfaces.Shape;
import com.uno.ood.FactoryDesignPatternScratch.shape.Circle;
import com.uno.ood.FactoryDesignPatternScratch.shape.Rectangle;
import com.uno.ood.FactoryDesignPatternScratch.shape.Square;

public class ShapeFactory {
	
	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
		{
			return null;
		}
		if(shapeType.equals("Circle"))
		{
			return new Circle();
		}
		if(shapeType.equals("Rectangle"))
		{
			return new Rectangle();
		}
		if(shapeType.equals("Square"))
		{
			return new Square();
		}
		return null;
		
	}

}
