package com.uno.ood.AbstractFactoryDesignPattern.producer;

import com.uno.ood.AbstractFactoryDesignPattern.factories.AbstractFactory;
import com.uno.ood.AbstractFactoryDesignPattern.factories.ColorFactory;
import com.uno.ood.AbstractFactoryDesignPattern.factories.ShapeFactory;

public class FactoryProducer {
	   public static AbstractFactory getFactory(String choice){
	   
	      if(choice.equalsIgnoreCase("SHAPE")){
	         return new ShapeFactory();
	         
	      }else if(choice.equalsIgnoreCase("COLOR")){
	         return new ColorFactory();
	      }
	      
	      return null;
	   }
	}