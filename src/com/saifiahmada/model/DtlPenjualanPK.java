package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jan 15, 2013 9:29:43 PM  **/

@Embeddable
public class DtlPenjualanPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ID_PENJUALAN", nullable=false, length=6)
	private String idpenjualan;
	
	@Column(name="ID_BARANG", nullable=false, length=6)
	private String idBarang;
	
	@Column(name="ID_RAK", nullable=false, length=6)
	private String idRak;
	
	public DtlPenjualanPK() {
	
	}
	
	public DtlPenjualanPK(String idpenjualan, String idBarang, String idRak) {
		this.idpenjualan = idpenjualan;
		this.idBarang = idBarang;
		this.idRak = idRak;
	}

	public String getIdRak() {
		return idRak;
	}

	public void setIdRak(String idRak) {
		this.idRak = idRak;
	}

	public String getIdpenjualan() {
		return idpenjualan;
	}

	public void setIdpenjualan(String idpenjualan) {
		this.idpenjualan = idpenjualan;
	}

	public String getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(String idBarang) {
		this.idBarang = idBarang;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idBarang == null) ? 0 : idBarang.hashCode());
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
		DtlPenjualanPK other = (DtlPenjualanPK) obj;
		if (idBarang == null) {
			if (other.idBarang != null)
				return false;
		} else if (!idBarang.equals(other.idBarang))
			return false;
		if (idpenjualan == null) {
			if (other.idpenjualan != null)
				return false;
		} else if (!idpenjualan.equals(other.idpenjualan))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DtlPenjualanPK [idpenjualan=" + idpenjualan + ", idBarang="
				+ idBarang + "]";
	}

}

