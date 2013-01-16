package com.saifiahmada.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.dao.HdrPenjualanDao;
import com.saifiahmada.dao.MstBarangDao;
import com.saifiahmada.model.MstBarang;


/** @author Saifi Ahmada Jan 16, 2013 10:40:14 AM  **/

public class TestModel {
	
public static void main (String [] args){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		MstBarangDao dao = (MstBarangDao) ac.getBean("mstBarangDao");
		
		System.out.println("mulai");
		
		MstBarang barang = new MstBarang("IDB003");
		barang.setHarga(3000);
		barang.setNamaBarang("Pantene");
		
		dao.save(barang, "user");
		
		System.out.println("end");
		
	}

}

