package com.saifiahmada.hibernate;

import java.util.List;

/** @author Saifi Ahmada Jan 16, 2013 10:46:42 AM  **/

public abstract interface MyGenericDao<T> {
	
	public void saveOrUpdate (final T domain, String user);
	public void save (final T domain, String user);
	public void update (final T domain, String user);
	public void delete (final T domain);
	public List<T> findAll ();
	public List<T> findByExample (final T domain);
	public List<T> findByCriteria (final T domain);
	public T findByPrimaryKey(final T domain);
	
}

