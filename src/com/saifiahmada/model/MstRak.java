package com.saifiahmada.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** @author Saifi Ahmada Jan 18, 2013 3:27:42 PM  **/

@Entity
@Table(name="MST_RAK")
public class MstRak implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MstRakPK mstRakPK;
	@Column(name="NAMA_RAK", nullable=false, length=20) 
	private String namaRak;
	
	@OneToMany(mappedBy="mstRak") 
	private Set<MstStok> mstStoks; 
	
	public MstRak() {
	
	}
	
	public MstRak(String idRak) {
		this.mstRakPK = new MstRakPK(idRak);
	}

	public Set<MstStok> getMstStoks() {
		return mstStoks;
	}

	public void setMstStoks(Set<MstStok> mstStoks) {
		this.mstStoks = mstStoks;
	}

	public MstRakPK getMstRakPK() {
		return mstRakPK;
	}

	public void setMstRakPK(MstRakPK mstRakPK) {
		this.mstRakPK = mstRakPK;
	}

	public String getNamaRak() {
		return namaRak;
	}

	public void setNamaRak(String namaRak) {
		this.namaRak = namaRak;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mstRakPK == null) ? 0 : mstRakPK.hashCode());
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
		MstRak other = (MstRak) obj;
		if (mstRakPK == null) {
			if (other.mstRakPK != null)
				return false;
		} else if (!mstRakPK.equals(other.mstRakPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstRak [mstRakPK=" + mstRakPK + "]";
	}
	
}

