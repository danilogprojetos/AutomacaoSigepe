package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the extrato database table.
 * 
 */
@Entity
@NamedQuery(name="Extrato.findAll", query="SELECT e FROM Extrato e")
public class Extrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExtratoPK id;

	private String des;

	public Extrato() {
	}

	public ExtratoPK getId() {
		return this.id;
	}

	public void setId(ExtratoPK id) {
		this.id = id;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

}