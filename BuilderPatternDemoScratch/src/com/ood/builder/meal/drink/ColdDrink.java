package com.ood.builder.meal.drink;

import com.ood.builder.meal.Item;
import com.ood.builder.meal.Packing;
import com.ood.builder.packing.Bottle;

public abstract class ColdDrink implements Item {

	@Override
	public Packing pack() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	public abstract float price();

}
