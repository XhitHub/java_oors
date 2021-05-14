package com.oors.expt.entity;

import java.util.List;

public abstract class Inferencable {
	private int inferenceOrder = 100;
	
	public int getInferenceOrder() {
		return inferenceOrder;
	}

	public void setInferenceOrder(int inferenceOrder) {
		this.inferenceOrder = inferenceOrder;
	}

	public Inferencable(Case c) {
		c.register(this);
	}
	
	public Inferencable(List<Inferencable> watchList) {
//		enforce registering of this Inferencable to watchlist upon creation  
		watchList.add(this);
	}
	public abstract void inference();
}