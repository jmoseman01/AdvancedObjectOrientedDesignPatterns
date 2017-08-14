package com.ood.builder.main;

import com.ood.builder.meal.Meal;
import com.ood.builder.meal.MealBuilder;

public class Main {

	public static void main(String[] args) {
		//create builder
		MealBuilder mealBuilder = new MealBuilder();
		//prepare the meal
		//create veg burger/Coke
		Meal vegMeal=mealBuilder.prepareVegMeal();
		//traverse veg meal
		vegMeal.showItems();

		//prepare the meal
		//create chickenburger/pepsi
		Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
		//traverse veg meal
		NonvegMeal.showItems();
	}

}
