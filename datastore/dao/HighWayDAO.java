package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.dto.HighWayDTO;
import com.xworkz.datastore.dto.HighWayType;

public interface HighWayDAO {
	boolean save(HighWayDTO dto);
	Collection<HighWayDTO>findAll();
	Collection<HighWayDTO>findAllNumber();
	int totalItems();
	Collection<HighWayDTO>findByHighWayType(HighWayType type);
	Collection<HighWayDTO>findByStateName(String sname);
	Collection<Integer>findNumberByStateName(String sname);
	boolean exist(HighWayDTO dto);
	boolean isCondition(int number);
	double findLengthByNumber(int no);
	HighWayDTO findByMaxLength();
	HighWayDTO findByMinLength();

}
