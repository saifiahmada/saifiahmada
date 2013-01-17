package com.saifiahmada.dao;

import java.util.List;

import com.saifiahmada.hibernate.MyHibernateDaoSupport;
import com.saifiahmada.model.MstBarang;

/** @author Saifi Ahmada Jan 16, 2013 11:16:15 AM  **/

public class MstBarangDaoImpl extends MyHibernateDaoSupport implements MstBarangDao {

	@Override
	public void saveOrUpdate(MstBarang domain, String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(MstBarang domain, String user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(domain);
	}

	@Override
	public void update(MstBarang domain, String user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(MstBarang domain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<MstBarang> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MstBarang> findByExample(MstBarang domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MstBarang> findByCriteria(MstBarang domain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MstBarang findByPrimaryKey(MstBarang domain) {
		// TODO Auto-generated method stub
		return null;
	}

}

