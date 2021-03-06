package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the catcfo database table.
 * 
 */
@Entity
@NamedQuery(name="Catcfo.findAll", query="SELECT c FROM Catcfo c")
public class Catcfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CATCFO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CATCFO_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String catcfo;

	public Catcfo() {
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

	public String getCatcfo() {
		return this.catcfo;
	}

	public void setCatcfo(String catcfo) {
		this.catcfo = catcfo;
	}

}