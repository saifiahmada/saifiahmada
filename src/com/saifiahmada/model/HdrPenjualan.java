package com.saifiahmada.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** @author Saifi Ahmada Jan 15, 2013 9:29:43 PM  **/

@Entity
@Table(name="HDR_PENJUALAN")
public class HdrPenjualan implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private HdrPenjualanPK hdrPenjualanPK;
	
	@Column(name="TGL_JUAL", length=11, nullable=false)
	@Temporal(TemporalType.DATE)
	private Date tglJual;
	
	@Column(name="ID_KONSUMEN")
	private String idKonsumen;
	
	@OneToMany(mappedBy="hdrPenjualan", cascade = CascadeType.ALL)
	private Set<DtlPenjualan> dtlPenjualans;
	
	public HdrPenjualan() {
	
	}
	
	public HdrPenjualan(String idpenjualan) {
		this.hdrPenjualanPK = new HdrPenjualanPK(idpenjualan);
	}

	public HdrPenjualanPK getHdrPenjualanPK() {
		return hdrPenjualanPK;
	}

	public void setHdrPenjualanPK(HdrPenjualanPK hdrPenjualanPK) {
		this.hdrPenjualanPK = hdrPenjualanPK;
	}

	public Date getTglJual() {
		return tglJual;
	}

	public void setTglJual(Date tglJual) {
		this.tglJual = tglJual;
	}

	public String getIdKonsumen() {
		return idKonsumen;
	}

	public void setIdKonsumen(String idKonsumen) {
		this.idKonsumen = idKonsumen;
	}

	public Set<DtlPenjualan> getDtlPenjualans() {
		return dtlPenjualans;
	}

	public void setDtlPenjualans(Set<DtlPenjualan> dtlPenjualans) {
		this.dtlPenjualans = dtlPenjualans;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((hdrPenjualanPK == null) ? 0 : hdrPenjualanPK.hashCode());
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
		HdrPenjualan other = (HdrPenjualan) obj;
		if (hdrPenjualanPK == null) {
			if (other.hdrPenjualanPK != null)
				return false;
		} else if (!hdrPenjualanPK.equals(other.hdrPenjualanPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HdrPenjualan [hdrPenjualanPK=" + hdrPenjualanPK + "]";
	}
	
}
