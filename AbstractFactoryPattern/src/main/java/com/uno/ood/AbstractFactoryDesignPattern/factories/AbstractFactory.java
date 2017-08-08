package com.uno.ood.AbstractFactoryDesignPattern.factories;

import com.uno.ood.AbstractFactoryDesignPattern.interfaces.Color;
import com.uno.ood.AbstractFactoryDesignPattern.interfaces.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
