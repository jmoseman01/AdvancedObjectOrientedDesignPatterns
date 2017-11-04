package com.ood.builder.meal;

import java.util.ArrayList;

import com.ood.builder.meal.burger.VegBurger;

public class Meal {
	public ArrayList<Item> items = new ArrayList<Item>();

	public void showItems() {
		for(Item item: items)
		{
			System.out.printf("Item:  %s\n",item.name());
			System.out.printf("Packing:  %s\n",item.pack());
			System.out.printf("Price:  %f\n",item.price());
		}
		
	}

	public void addItem(Item item) {
		items.add(item);
	}

}
