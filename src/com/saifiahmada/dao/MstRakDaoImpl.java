package com.saifiahmada.dao;

import java.util.List;

import com.saifiahmada.hibernate.MyHibernateDaoSupport;
import com.saifiahmada.model.MstRak;

/** @author Saifi Ahmada Jan 18, 2013 3:34:33 PM  **/

public class MstRakDaoImpl extends MyHibernateDaoSupport implements MstRakDao {

	@Override
	public void saveOrUpdate(MstRak domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	public void save(MstRak domain, String user) {
		// TODO , masbro
		getHibernateTemplate().save(domain);
		
	}

	@Override
	public void update(MstRak domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	public void delete(MstRak domain) {
		// TODO , masbro
		
		
	}

	@Override
	public List<MstRak> findAll() {
		// TODO , masbro
		
		return null;
	}

	@Override
	public List<MstRak> findByExample(MstRak domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public List<MstRak> findByCriteria(MstRak domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public MstRak findByPrimaryKey(MstRak domain) {
		// TODO , masbro
		
		return null;
	}

}

