package com.saifiahmada.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Transactional;

import com.saifiahmada.hibernate.MyHibernateDaoSupport;
import com.saifiahmada.model.MstStok;

/** @author Saifi Ahmada Jan 18, 2013 3:36:14 PM  **/

public class MstStokDaoImpl extends MyHibernateDaoSupport implements MstStokDao {

	@Override
	@Transactional(readOnly=false)
	public void saveOrUpdate(MstStok domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	@Transactional(readOnly=false)
	public void save(MstStok domain, String user) {
		// TODO , masbro
		getHibernateTemplate().save(domain);
		
	}

	@Override
	@Transactional(readOnly=false)
	public void update(MstStok domain, String user) {
		// TODO , masbro
		
		
	}

	@Override
	@Transactional(readOnly=false)
	public void delete(MstStok domain) {
		// TODO , masbro
		
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<MstStok> findAll() {
		// TODO , masbro
		
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public List<MstStok> findByExample(MstStok domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	@Transactional(readOnly=true)
	public List<MstStok> findByCriteria(MstStok domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	public MstStok findByPrimaryKey(MstStok domain) {
		// TODO , masbro
		
		return null;
	}

	@Override
	@Transactional(readOnly=false)
	public void updateTambahiStok(String idBarang, String idRak, int qty) {
		// TODO , masbro
		System.out.println("Proses awal penambahan stok");
		String sql = "select s from MstStok s where s.idBarang  = :idBarang and s.idRak = :idRak";
		Query q = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sql);
		q.setString("idBarang", idBarang);
		q.setString("idRak", idRak);
		
		MstStok stok = (MstStok) q.uniqueResult();
		int qtyAsal = stok.getQty() ;
		int qtyUpdate = qtyAsal + qty;
		
		if (qtyUpdate < 0){
			System.out.println("Quantity setelah transaksi tidak boleh < 0");
		}
		
		stok.setQty(qtyUpdate);
		
		getHibernateTemplate().saveOrUpdate(stok);
		System.out.println("update tambah stok sukses");
		
	}

	@Override
	@Transactional(readOnly=false)
	public void updateKurangiStok(String idBarang, String idRak, int qty) {
		// TODO , masbro
		System.out.println("Proses awal pengurangan stok");
		
		String sqlString = "select s from MstStok s where s.mstStokPK.idBarang = :idBarang and s.mstStokPK.idRak = :idRak";
		Query q = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sqlString);
		q.setString("idBarang", idBarang);
		q.setString("idRak", idRak);
		MstStok stok = (MstStok) q.uniqueResult();
		
		int qtyAsal = stok.getQty();
		int qtyUpdate = qtyAsal - qty;
		
		if (qtyUpdate < 0){
			System.out.println("Qty setelah transaksi tidak boleh < 0");
		}
		
		stok.setQty(qtyUpdate);
		
		getHibernateTemplate().saveOrUpdate(stok);
		
		System.out.println("Pengurangan stok sukses");
		
	}

	

}

