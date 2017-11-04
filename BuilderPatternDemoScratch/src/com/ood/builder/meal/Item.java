package com.ood.builder.meal;

import com.ood.builder.packing.Wrapper;

public interface Item {
	public Packing pack();
	public String name();
	public float price();

}
