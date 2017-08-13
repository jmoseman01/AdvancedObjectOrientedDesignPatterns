package com.ood.builder.packing;

import com.ood.interfaces.Packing;

public class Bottle implements Packing {

	@Override
	public String pack() {
		return "pack bottle";
	}

}
