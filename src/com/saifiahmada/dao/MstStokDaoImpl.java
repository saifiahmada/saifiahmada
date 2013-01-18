package com.saifiahmada.dao;

import java.util.List;

import com.saifiahmada.hibernate.MyHibernateDaoSupport;
import com.saifiahmada.model.MstStok;

/** @author Saifi Ahmada Jan 18, 2013 3:36:14 PM  **/

public class MstStokDaoImpl extends MyHibernateDaoSupport implements MstStokDao {

	@Override
	public void saveOrUpdate(MstStok domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	public void save(MstStok domain, String user) {
		// TODO , masbro
		getHibernateTemplate().save(domain);
		
	}

	@Override
	public void update(MstStok domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	public void delete(MstStok domain) {
		// TODO , masbro
		
		
	}

	@Override
	public List<MstStok> findAll() {
		// TODO , masbro
		
		return null;
	}

	@Override
	public List<MstStok> findByExample(MstStok domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public List<MstStok> findByCriteria(MstStok domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public MstStok findByPrimaryKey(MstStok domain) {
		// TODO , masbro
		
		return null;
	}

}

