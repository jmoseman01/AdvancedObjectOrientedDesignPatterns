package com.ood.builder.packing;

import com.ood.builder.meal.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "pack bottle";
	}
	
	@Override
	public String toString()
	{
		return "Bottle";
	}

}
