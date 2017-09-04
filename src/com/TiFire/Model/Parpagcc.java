package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parpagcc database table.
 * 
 */
@Entity
@NamedQuery(name="Parpagcc.findAll", query="SELECT p FROM Parpagcc p")
public class Parpagcc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParpagccPK id;

	public Parpagcc() {
	}

	public ParpagccPK getId() {
		return this.id;
	}

	public void setId(ParpagccPK id) {
		this.id = id;
	}

}