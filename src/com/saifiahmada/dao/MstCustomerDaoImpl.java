package com.saifiahmada.dao;

import java.util.List;

import com.saifiahmada.hibernate.MyHibernateDaoSupport;
import com.saifiahmada.model.MstCustomer;

/** @author Saifi Ahmada Jan 16, 2013 4:59:10 PM  **/

public class MstCustomerDaoImpl extends MyHibernateDaoSupport implements MstCustomerDao {

	@Override
	public void saveOrUpdate(MstCustomer domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	public void save(MstCustomer domain, String user) {
		// TODO , masbro
		getHibernateTemplate().save(domain);
		
	}

	@Override
	public void update(MstCustomer domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	public void delete(MstCustomer domain) {
		// TODO , masbro
		
		
	}

	@Override
	public List<MstCustomer> findAll() {
		// TODO , masbro
		
		return null;
	}

	@Override
	public List<MstCustomer> findByExample(MstCustomer domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public List<MstCustomer> findByCriteria(MstCustomer domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public MstCustomer findByPrimaryKey(MstCustomer domain) {
		// TODO , masbro
		
		return null;
	}

	
	
	
}

