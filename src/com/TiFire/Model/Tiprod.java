package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tiprod database table.
 * 
 */
@Entity
@NamedQuery(name="Tiprod.findAll", query="SELECT t FROM Tiprod t")
public class Tiprod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPROD_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPROD_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String tiprod;

	public Tiprod() {
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

	public String getTiprod() {
		return this.tiprod;
	}

	public void setTiprod(String tiprod) {
		this.tiprod = tiprod;
	}

}