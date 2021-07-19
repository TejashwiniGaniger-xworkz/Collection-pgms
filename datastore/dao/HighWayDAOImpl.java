package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.HighWayDTO;
import com.xworkz.datastore.dto.HighWayType;

public class HighWayDAOImpl implements HighWayDAO {
	private List<HighWayDTO> list = new ArrayList<HighWayDTO>();

	@Override
	public boolean save(HighWayDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public Collection<HighWayDTO> findAll() {

		return this.list;

	}

	@Override
	public Collection<HighWayDTO> findAllNumber() {
		Collection<HighWayDTO> tempCollection = new ArrayList<HighWayDTO>();
		Iterator<HighWayDTO> allNumber = this.list.iterator();
		while (allNumber.hasNext()) {
			HighWayDTO findallNumber = allNumber.next();
			System.out.println("findallNumber :" + findallNumber.getNumber());
			tempCollection.add(findallNumber);
		}
		return tempCollection;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public Collection<HighWayDTO> findByHighWayType(HighWayType type) {
		Collection<HighWayDTO> tempCollection = new ArrayList<HighWayDTO>();
		Iterator<HighWayDTO> highwayType = this.list.iterator();
		while (highwayType.hasNext()) {
			HighWayDTO highwaytype = highwayType.next();

			if (highwaytype.getType().equals(type)) {

				tempCollection.add(highwaytype);
			}

		}
		return tempCollection;
	}

	@Override
	public Collection<HighWayDTO> findByStateName(String sname) {
		HighWayDTO dto = null;
		Collection<HighWayDTO> tempCollection = new ArrayList<HighWayDTO>();
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if (highwayDTO.getStateName().equals(sname)) {
				tempCollection.add(highwayDTO);
			}
		}
		return tempCollection;
	}

	@Override
	public Collection<Integer> findNumberByStateName(String sname) {

		Collection<Integer> tempCollection = new ArrayList<>();
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if (highwayDTO.getStateName().equals(sname)) {
				tempCollection.add(highwayDTO.getNumber());

			}
		}

		return tempCollection;
	}

	@Override
	public boolean exist(HighWayDTO dto) {

		return this.list.contains(dto);
	}

	@Override
	public boolean isCondition(int number) {
		double dto = 0;
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if (highwayDTO.getNumber() == (number)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double findLengthByNumber(int no) {
		double dto = 0;
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if (highwayDTO.getNumber() == (no)) {
				dto = highwayDTO.getLength();
				break;
			}

		}
		return dto;
	}

	@Override
	public HighWayDTO findByMaxLength() {
		Iterator<HighWayDTO> itr = this.list.iterator();
		HighWayDTO dto = itr.next();
		while (itr.hasNext()) {
			double length = dto.getLength();
			HighWayDTO highwayDTO = itr.next();
			if(highwayDTO.getLength() > length) {
				System.out.println("---found by maximum length---");
				dto = highwayDTO;
			}
		}
		return dto;
	}
	@Override
	public HighWayDTO findByMinLength() {
		Iterator<HighWayDTO> itr = this.list.iterator();
		HighWayDTO dto = itr.next();
		double length = dto.getLength();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if(highwayDTO.getLength() < length) {
				System.out.println("---found by maximum length---");
				dto = highwayDTO;
			}
		}
		return dto;
	}

	
}
