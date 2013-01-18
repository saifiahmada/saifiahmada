package com.saifiahmada.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** @author Saifi Ahmada Jan 15, 2013 10:11:35 PM  **/

@Entity
@Table(name="MST_BARANG")
public class MstBarang implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MstBarangPK mstBarangPK;
	@Column(name="NAMA_BARANG")
	private String namaBarang;
	@Column(name="HARGA")
	private Integer harga;
	
	@OneToMany(mappedBy="mstBarang") 
	private Set<DtlPenjualan> dtlPenjualans;
	
	public MstBarang() {
	
	}
	
	public MstBarang(String idBarang) {
		this.mstBarangPK = new MstBarangPK(idBarang);
	}

	public Set<DtlPenjualan> getDtlPenjualans() {
		return dtlPenjualans;
	}

	public void setDtlPenjualans(Set<DtlPenjualan> dtlPenjualans) {
		this.dtlPenjualans = dtlPenjualans;
	}

	public MstBarangPK getMstBarangPK() {
		return mstBarangPK;
	}

	public void setMstBarangPK(MstBarangPK mstBarangPK) {
		this.mstBarangPK = mstBarangPK;
	}

	public String getNamaBarang() {
		return namaBarang;
	}

	public void setNamaBarang(String namaBarang) {
		this.namaBarang = namaBarang;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mstBarangPK == null) ? 0 : mstBarangPK.hashCode());
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
		MstBarang other = (MstBarang) obj;
		if (mstBarangPK == null) {
			if (other.mstBarangPK != null)
				return false;
		} else if (!mstBarangPK.equals(other.mstBarangPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstBarang [mstBarangPK=" + mstBarangPK + "]";
	}
	
	
}

