package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipmar database table.
 * 
 */
@Entity
@NamedQuery(name="Tipmar.findAll", query="SELECT t FROM Tipmar t")
public class Tipmar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPMAR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPMAR_COD_GENERATOR")
	private Integer cod;

	private String tipmar;

	public Tipmar() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getTipmar() {
		return this.tipmar;
	}

	public void setTipmar(String tipmar) {
		this.tipmar = tipmar;
	}

}