package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the impordcom database table.
 * 
 */
@Embeddable
public class ImpordcomPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private Integer coditeordcom;

	private Integer codimp;

	public ImpordcomPK() {
	}
	public Integer getCoditeordcom() {
		return this.coditeordcom;
	}
	public void setCoditeordcom(Integer coditeordcom) {
		this.coditeordcom = coditeordcom;
	}
	public Integer getCodimp() {
		return this.codimp;
	}
	public void setCodimp(Integer codimp) {
		this.codimp = codimp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ImpordcomPK)) {
			return false;
		}
		ImpordcomPK castOther = (ImpordcomPK)other;
		return 
			this.coditeordcom.equals(castOther.coditeordcom)
			&& this.codimp.equals(castOther.codimp);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.coditeordcom.hashCode();
		hash = hash * prime + this.codimp.hashCode();
		
		return hash;
	}
}