package com.saifiahmada.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.dao.MstStokDao;
import com.saifiahmada.model.MstBarang;
import com.saifiahmada.model.MstRak;
import com.saifiahmada.model.MstStok;

/** @author Saifi Ahmada Jan 18, 2013 4:04:05 PM  **/

public class TesMstStok {
	
	public static void main(String[] args) {
		
		System.out.println("Mulai");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MstStokDao dao = (MstStokDao) ac.getBean("mstStokDao");
		
		MstStok stok = new MstStok("IDB003", "RAK001");
		
//		MstBarang b = new MstBarang("IDB001");
//		MstRak r = new MstRak("RAK001");
//		
//		stok.setMstBarang(b);
//		stok.setMstRak(r);
		
		stok.setQty(10);
		
		dao.save(stok, "user");
		
		System.out.println("commit");
		
	}

}

