package com.ood.builder.meal.burger;

import com.ood.builder.meal.Item;
import com.ood.builder.meal.Packing;
import com.ood.builder.packing.Wrapper;


public abstract class Burger implements Item {

	@Override
	public Packing pack() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
}
