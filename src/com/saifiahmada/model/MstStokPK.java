package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jan 18, 2013 3:13:34 PM  **/

@Embeddable
public class MstStokPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ID_BARANG", nullable=false, length=6)
	private String idBarang;
	@Column(name="ID_RAK", nullable=false, length=6)
	private String idRak;
	
	public MstStokPK() {
	
	}
	
	public MstStokPK(String idBarang, String idRak) {
		this.idBarang = idBarang;
		this.idRak = idRak;
	}

	public String getIdBarang() {
		return idBarang;
	}

	public void setIdBarang(String idBarang) {
		this.idBarang = idBarang;
	}

	public String getIdRak() {
		return idRak;
	}

	public void setIdRak(String idRak) {
		this.idRak = idRak;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idBarang == null) ? 0 : idBarang.hashCode());
		result = prime * result + ((idRak == null) ? 0 : idRak.hashCode());
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
		MstStokPK other = (MstStokPK) obj;
		if (idBarang == null) {
			if (other.idBarang != null)
				return false;
		} else if (!idBarang.equals(other.idBarang))
			return false;
		if (idRak == null) {
			if (other.idRak != null)
				return false;
		} else if (!idRak.equals(other.idRak))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstStokPK [idBarang=" + idBarang + ", idRak=" + idRak + "]";
	}
	
}

