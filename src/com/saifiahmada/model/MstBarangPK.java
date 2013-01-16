package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jan 15, 2013 10:11:50 PM  **/

@Embeddable
public class MstBarangPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ID_BARANG")
	private String idBarang;
	
	public MstBarangPK() {
	
	}
	
	public MstBarangPK(String idBarang) {
		this.idBarang = idBarang;
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
		MstBarangPK other = (MstBarangPK) obj;
		if (idBarang == null) {
			if (other.idBarang != null)
				return false;
		} else if (!idBarang.equals(other.idBarang))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstBarangPK [idBarang=" + idBarang + "]";
	}
	
}

