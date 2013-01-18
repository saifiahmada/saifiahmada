package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/** @author Saifi Ahmada Jan 18, 2013 3:17:42 PM  **/

@Entity
@Table(name="MST_STOK") 
public class MstStok implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MstStokPK mstStokPK;
	
	private int qty;
	
	@ManyToOne
	@JoinColumn(name="ID_BARANG", referencedColumnName="ID_BARANG", insertable=false, updatable=false)
	private MstBarang mstBarang;
	
	@ManyToOne
	@JoinColumn(name="ID_RAK", referencedColumnName="ID_RAK", insertable=false, updatable=false)
	private MstRak mstRak;
	
	public MstStok() {
	
	}
	
	public MstStok(String idBarang, String idRak) {
		this.mstStokPK = new MstStokPK(idBarang, idRak);
	}

	public MstRak getMstRak() {
		return mstRak;
	}

	public void setMstRak(MstRak mstRak) {
		this.mstRak = mstRak;
	}

	public MstBarang getMstBarang() {
		return mstBarang;
	}

	public void setMstBarang(MstBarang mstBarang) {
		this.mstBarang = mstBarang;
	}

	public MstStokPK getMstStokPK() {
		return mstStokPK;
	}

	public void setMstStokPK(MstStokPK mstStokPK) {
		this.mstStokPK = mstStokPK;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mstStokPK == null) ? 0 : mstStokPK.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MstStok other = (MstStok) obj;
		if (mstStokPK == null) {
			if (other.mstStokPK != null)
				return false;
		} else if (!mstStokPK.equals(other.mstStokPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstStok [mstStokPK=" + mstStokPK + "]";
	}
	
}

