package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jan 15, 2013 9:29:43 PM  **/

@Entity
@Table(name="DTL_PENJUALAN")
public class DtlPenjualan implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private DtlPenjualanPK dtlPenjualanPK;
	
	@ManyToOne
	@JoinColumn(name="ID_BARANG", referencedColumnName="ID_BARANG", insertable=false, updatable=false)
	private MstBarang mstBarang;
	
	@Column(name="QTY", length=4, nullable=false)
	private int qty;
	
	@Column(name="HARGA", length=10)
	private int harga;
	
	@ManyToOne
	@JoinColumn(name="ID_PENJUALAN", referencedColumnName="ID_PENJUALAN", insertable=false, updatable=false)
	private HdrPenjualan hdrPenjualan;
	
	public DtlPenjualan() {

	}
	
	public DtlPenjualan(String idpenjualan, String idBarang) {
		this.dtlPenjualanPK = new DtlPenjualanPK(idpenjualan, idBarang);
	}

	public DtlPenjualanPK getDtlPenjualanPK() {
		return dtlPenjualanPK;
	}

	public void setDtlPenjualanPK(DtlPenjualanPK dtlPenjualanPK) {
		this.dtlPenjualanPK = dtlPenjualanPK;
	}

	public MstBarang getMstBarang() {
		return mstBarang;
	}

	public void setMstBarang(MstBarang mstBarang) {
		this.mstBarang = mstBarang;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public HdrPenjualan getHdrPenjualan() {
		return hdrPenjualan;
	}

	public void setHdrPenjualan(HdrPenjualan hdrPenjualan) {
		this.hdrPenjualan = hdrPenjualan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dtlPenjualanPK == null) ? 0 : dtlPenjualanPK.hashCode());
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
		DtlPenjualan other = (DtlPenjualan) obj;
		if (dtlPenjualanPK == null) {
			if (other.dtlPenjualanPK != null)
				return false;
		} else if (!dtlPenjualanPK.equals(other.dtlPenjualanPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DtlPenjualan [dtlPenjualanPK=" + dtlPenjualanPK + "]";
	}
	
}

