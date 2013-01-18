package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jan 18, 2013 3:24:59 PM  **/

@Embeddable
public class MstRakPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ID_RAK", length=6, nullable=false)
	private String idRak;
	
	public MstRakPK() {
	
	}
	
	public MstRakPK(String idRak) {
		this.idRak = idRak;
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
		MstRakPK other = (MstRakPK) obj;
		if (idRak == null) {
			if (other.idRak != null)
				return false;
		} else if (!idRak.equals(other.idRak))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstRakPK [idRak=" + idRak + "]";
	}
	
}

