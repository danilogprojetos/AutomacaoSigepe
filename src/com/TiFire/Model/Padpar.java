package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the padpar database table.
 * 
 */
@Entity
@NamedQuery(name="Padpar.findAll", query="SELECT p FROM Padpar p")
public class Padpar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PADPAR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PADPAR_COD_GENERATOR")
	private Integer cod;

	private String padpar;

	public Padpar() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getPadpar() {
		return this.padpar;
	}

	public void setPadpar(String padpar) {
		this.padpar = padpar;
	}

}