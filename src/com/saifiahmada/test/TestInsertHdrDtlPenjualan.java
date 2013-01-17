package com.saifiahmada.test;

import java.util.Date;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.dao.HdrPenjualanDao;
import com.saifiahmada.model.DtlPenjualan;
import com.saifiahmada.model.HdrPenjualan;
import com.saifiahmada.model.MstCustomer;

/** @author Saifi Ahmada Jan 16, 2013 4:26:24 PM  **/

public class TestInsertHdrDtlPenjualan {
	
public static void main (String [] args){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HdrPenjualanDao dao = (HdrPenjualanDao) ac.getBean("hdrPenjualanDao");
		
		System.out.println("Awal");
		String idPenjualan = "J0001";
		HdrPenjualan hdr = new HdrPenjualan(idPenjualan);
		
		hdr.setDtlPenjualans(new HashSet<DtlPenjualan>());
		MstCustomer mCust = new MstCustomer("IDC001");
		hdr.setMstCustomer(mCust);
		hdr.setTglJual(new Date());
		
		DtlPenjualan dtl = new DtlPenjualan(idPenjualan, "IDB001");
		
		dtl.setHarga(5000);
		dtl.setQty(1);
		
		hdr.getDtlPenjualans().add(dtl);
		
		dtl = new DtlPenjualan(idPenjualan, "IDB002");
		dtl.setHarga(3000);
		dtl.setQty(1);
		
		hdr.getDtlPenjualans().add(dtl);
		
		dtl = new DtlPenjualan(idPenjualan, "IDB003");
		dtl.setHarga(3000);
		dtl.setQty(1);
		
		hdr.getDtlPenjualans().add(dtl);
		
		dao.save(hdr, "user");
		
		System.out.println("Commit");
		
		
	}

}

