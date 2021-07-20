package com.xworkz.datastore.comparator;

import java.util.Comparator;

import com.xworkz.datastore.dto.KitchenItemDTO;

public class KitchenUsedForComparator implements Comparator<KitchenItemDTO> {
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) 
	{
		return o1.getUsedFor().compareTo(o2.getUsedFor()); 
	}

}