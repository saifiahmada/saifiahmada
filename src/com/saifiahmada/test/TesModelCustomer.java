package com.saifiahmada.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.dao.MstCustomerDao;
import com.saifiahmada.model.MstCustomer;

/** @author Saifi Ahmada Jan 16, 2013 5:08:43 PM  **/

public class TesModelCustomer {
	
	public static void main (String [] args){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MstCustomerDao dao = (MstCustomerDao) ac.getBean("mstCustomerDao");
		
		System.out.println("Mulai");
		
		MstCustomer customer = new MstCustomer("IDC001");
		customer.setAlamat("Kandangan");
		customer.setNama("Ahmada");
		customer.setNoKontak("085 751 635 XXX");
		
		dao.save(customer, "user");
		
		System.out.println("Commit Customer"); 
		
	}

}

