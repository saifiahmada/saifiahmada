package com.saifiahmada.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.saifiahmada.hibernate.MyHibernateDaoSupport;
import com.saifiahmada.model.HdrPenjualan;

/** @author Saifi Ahmada Jan 16, 2013 10:51:06 AM  **/

public class HdrPenjualanDaoImpl extends MyHibernateDaoSupport implements HdrPenjualanDao {

	@Override
	@Transactional(readOnly=false)
	public void saveOrUpdate(HdrPenjualan domain, String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly=false)
	public void save(HdrPenjualan domain, String user) {
		getHibernateTemplate().saveOrUpdate(domain);
		
	}

	@Override
	@Transactional(readOnly=false)
	public void update(HdrPenjualan domain, String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(HdrPenjualan domain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<HdrPenjualan> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public List<HdrPenjualan> findByExample(HdrPenjualan domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public List<HdrPenjualan> findByCriteria(HdrPenjualan domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public HdrPenjualan findByPrimaryKey(HdrPenjualan domain) {
		// TODO Auto-generated method stub
		return null;
	}

}

