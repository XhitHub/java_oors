package com.oors.expt.entity;

import java.util.Comparator;
import java.util.List;

public class Case {
	private List<Inferencable> facts;
	
	public void inference() {
		for( Inferencable inf : facts) {
			inf.inference();
		}
	}
	
	public void register(Inferencable i) {
		facts.add(i);
		facts.sort(new Comparator<Inferencable>() {
			@Override
			public int compare(Inferencable o1, Inferencable o2) {
				// TODO Auto-generated method stub
				return o1.getInferenceOrder() - o2.getInferenceOrder();
			}
		});
	}
}
