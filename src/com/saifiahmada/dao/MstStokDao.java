package com.saifiahmada.dao;

import com.saifiahmada.hibernate.MyGenericDao;
import com.saifiahmada.model.MstStok;

/** @author Saifi Ahmada Jan 18, 2013 3:36:25 PM  **/

public interface MstStokDao extends MyGenericDao<MstStok> { 
	public void updateTambahiStok(String idBarang, String idRak, int qty);
	public void updateKurangiStok(String idBarang, String idRak, int qty);
}

