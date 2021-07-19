package com.xworkz.datastore.tester;

import com.xworkz.datastore.dao.HighWayDAO;
import com.xworkz.datastore.dao.HighWayDAOImpl;
import com.xworkz.datastore.dto.HighWayDTO;
import com.xworkz.datastore.dto.HighWayType;

public class HighWayTester {

	public static void main(String[] args) {
		HighWayDTO dto = new HighWayDTO(1,20,HighWayType.SH,"Karnatak",777,true,"L&T");
		HighWayDTO dto1 = new HighWayDTO(2,22,HighWayType.NH,"Maharashtra",887,false,"IRB");
		HighWayDTO dto2 = new HighWayDTO(3,24,HighWayType.URBAN,"Tamilnadu",999,false,"Ashoka Build Con");
		HighWayDAO dao = new HighWayDAOImpl();
		dao.save(dto);
		dao.save(dto2);
		dao.save(dto1);
		System.out.println("find total items : " +dao.totalItems());
		System.out.println("find all number : " +dao.findAllNumber());
		System.out.println("*********");
		System.out.println("find by state name : " +dao.findByStateName("Karnatak"));
		System.out.println("find by highway type : " +dao.findByHighWayType(HighWayType.NH));
		System.out.println("find length by number : " +dao.findLengthByNumber(22));
		System.out.println("condition : " +dao.isCondition(25));
		System.out.println("exist : " +dao.exist(dto));
		System.out.println("find number by name: " +dao.findNumberByStateName("Tamilnadu"));
		System.out.println("find max Length :" +dao.findByMaxLength());
		System.out.println("find min length :" +dao.findByMinLength());
	}
	

}
