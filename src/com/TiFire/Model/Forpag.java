package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the forpag database table.
 * 
 */
@Entity
@NamedQuery(name="Forpag.findAll", query="SELECT f FROM Forpag f")
public class Forpag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FORPAG_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FORPAG_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String forpag;

	public Forpag() {
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

	public String getForpag() {
		return this.forpag;
	}

	public void setForpag(String forpag) {
		this.forpag = forpag;
	}

}