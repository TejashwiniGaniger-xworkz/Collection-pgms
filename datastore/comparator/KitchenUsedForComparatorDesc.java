package com.xworkz.datastore.comparator;

import java.util.Comparator;

import com.xworkz.datastore.dto.KitchenItemDTO;

public class KitchenUsedForComparatorDesc implements Comparator<KitchenItemDTO> {
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		
		return o2.getUsedFor().compareTo(o1.getUsedFor()); 
	}



}