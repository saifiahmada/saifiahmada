package com.saifiahmada.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.dao.MstRakDao;
import com.saifiahmada.dao.MstStokDao;
import com.saifiahmada.model.MstRak;

/** @author Saifi Ahmada Jan 18, 2013 3:42:35 PM  **/

public class TesMstRak {
	
	public static void main (String [] args){
		
		System.out.println("Mulai");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MstRakDao dao =  (MstRakDao) ac.getBean("mstRakDao");
		
		MstRak rak = new MstRak("RAK003");
		rak.setNamaRak("RAK003");
		
		dao.save(rak, "user");
		
		System.out.println("Commit");
		
	}

}

