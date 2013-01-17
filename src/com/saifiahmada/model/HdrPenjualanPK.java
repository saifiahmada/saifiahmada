package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jan 15, 2013 9:29:43 PM  **/

@Embeddable
public class HdrPenjualanPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ID_PENJUALAN", nullable=false, length=6)
	private String idpenjualan;
	
	public HdrPenjualanPK() {

	}
	
	public HdrPenjualanPK(String idpenjualan) {
		this.idpenjualan = idpenjualan;
	}

	public String getIdpenjualan() {
		return idpenjualan;
	}

	public void setIdpenjualan(String idpenjualan) {
		this.idpenjualan = idpenjualan;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idpenjualan == null) ? 0 : idpenjualan.hashCode());
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
		HdrPenjualanPK other = (HdrPenjualanPK) obj;
		if (idpenjualan == null) {
			if (other.idpenjualan != null)
				return false;
		} else if (!idpenjualan.equals(other.idpenjualan))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HdrPenjualanPK [idpenjualan=" + idpenjualan + "]";
	}

}
