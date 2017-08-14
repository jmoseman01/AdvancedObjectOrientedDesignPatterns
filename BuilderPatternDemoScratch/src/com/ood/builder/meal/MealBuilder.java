package com.ood.builder.meal;

import com.ood.builder.main.Meal;

public class MealBuilder {

	public Meal prepareVegMeal() {
		// TODO Auto-generated method stub
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke);
		return meal;
	}

	public Meal prepareNonVegMeal() {
		// TODO Auto-generated method stub
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
