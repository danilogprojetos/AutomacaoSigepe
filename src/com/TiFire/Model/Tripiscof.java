package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tripiscof database table.
 * 
 */
@Entity
@NamedQuery(name="Tripiscof.findAll", query="SELECT t FROM Tripiscof t")
public class Tripiscof implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRIPISCOF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRIPISCOF_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String tripiscof;

	public Tripiscof() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}

	public String getTripiscof() {
		return this.tripiscof;
	}

	public void setTripiscof(String tripiscof) {
		this.tripiscof = tripiscof;
	}

}