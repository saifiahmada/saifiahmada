package com.saifiahmada.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/** @author Saifi Ahmada Jan 16, 2013 4:49:04 PM  **/

@Entity
@Table(name="MST_CUSTOMER")
public class MstCustomer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MstCustomerPK mstCustomerPK;
	@Column(name="NAMA", length=30, nullable=false)
	private String nama;
	@Column(name="ALAMAT", length=100)
	private String alamat;
	@Column(name="NO_KONTAK" , length=15)
	private String noKontak;
	
	@OneToMany(mappedBy="mstCustomer")
	private Set<HdrPenjualan> hdrPejualans;
	
	public MstCustomer() {
	
	}
	
	public Set<HdrPenjualan> getHdrPejualans() {
		return hdrPejualans;
	}

	public void setHdrPejualans(Set<HdrPenjualan> hdrPejualans) {
		this.hdrPejualans = hdrPejualans;
	}

	public MstCustomer(String idCustomer) {
		this.mstCustomerPK = new MstCustomerPK(idCustomer);
	}

	public MstCustomerPK getMstCustomerPK() {
		return mstCustomerPK;
	}

	public void setMstCustomerPK(MstCustomerPK mstCustomerPK) {
		this.mstCustomerPK = mstCustomerPK;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoKontak() {
		return noKontak;
	}

	public void setNoKontak(String noKontak) {
		this.noKontak = noKontak;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((mstCustomerPK == null) ? 0 : mstCustomerPK.hashCode());
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
		MstCustomer other = (MstCustomer) obj;
		if (mstCustomerPK == null) {
			if (other.mstCustomerPK != null)
				return false;
		} else if (!mstCustomerPK.equals(other.mstCustomerPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstCustomer [mstCustomerPK=" + mstCustomerPK + "]";
	}
	
}

