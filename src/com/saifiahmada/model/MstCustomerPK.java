package com.saifiahmada.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jan 16, 2013 4:49:16 PM  **/

@Embeddable
public class MstCustomerPK implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name="ID_CUSTOMER", length=6, nullable=false)
	private String idCustomer;
	
	public MstCustomerPK() {
	
	}
	
	public MstCustomerPK(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idCustomer == null) ? 0 : idCustomer.hashCode());
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
		MstCustomerPK other = (MstCustomerPK) obj;
		if (idCustomer == null) {
			if (other.idCustomer != null)
				return false;
		} else if (!idCustomer.equals(other.idCustomer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MstCustomerPK [idCustomer=" + idCustomer + "]";
	}
	
}

