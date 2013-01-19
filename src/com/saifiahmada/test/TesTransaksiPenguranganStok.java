package com.saifiahmada.test;

import java.util.Date;
import java.util.HashSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saifiahmada.dao.HdrPenjualanDao;
import com.saifiahmada.dao.MstStokDao;
import com.saifiahmada.model.DtlPenjualan;
import com.saifiahmada.model.HdrPenjualan;
import com.saifiahmada.model.MstCustomer;

/** @author Saifi Ahmada Jan 19, 2013 10:10:02 AM  **/

public class TesTransaksiPenguranganStok {
	
	public static void main(String[] args) {
		System.out.println("tes pengurangan stok");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HdrPenjualanDao jualDao = (HdrPenjualanDao) ac.getBean("hdrPenjualanDao");
		String idPenjualan = "J00001";
		 
		HdrPenjualan hdrPenjualan = new HdrPenjualan(idPenjualan);
		hdrPenjualan.setMstCustomer(new MstCustomer("IDC001"));
		hdrPenjualan.setTglJual(new Date());
		
		hdrPenjualan.setDtlPenjualans(new HashSet<DtlPenjualan>());
		DtlPenjualan dtlPenjualan = new DtlPenjualan(idPenjualan, "IDB001", "RAK001");
		dtlPenjualan.setHarga(5000);
		int qtyJual = 1;
		dtlPenjualan.setQty(qtyJual);
		
		MstStokDao stokDao = (MstStokDao) ac.getBean("mstStokDao");
		stokDao.updateKurangiStok("IDB001", "RAK001", qtyJual);
		
		hdrPenjualan.getDtlPenjualans().add(dtlPenjualan);
		
		jualDao.save(hdrPenjualan, "user");
		
		System.out.println("proses selesai");
	}

}

