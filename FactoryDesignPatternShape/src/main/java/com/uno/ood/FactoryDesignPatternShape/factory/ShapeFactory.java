package com.uno.ood.FactoryDesignPatternShape.factory;

import com.uno.ood.FactoryDesignPatternShape.shape.Circle;
import com.uno.ood.FactoryDesignPatternShape.shape.Rectangle;
import com.uno.ood.FactoryDesignPatternShape.shape.Shape;
import com.uno.ood.FactoryDesignPatternShape.shape.Square;

public class ShapeFactory
{

	/**
	 * Returns a specific shape type based on a string parameter
	 * @param shapeType
	 * @return shapeType
	 */
	public Shape getShape(String shapeType)
	{
		if(shapeType == null)
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
