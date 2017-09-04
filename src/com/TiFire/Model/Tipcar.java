package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipcar database table.
 * 
 */
@Entity
@NamedQuery(name="Tipcar.findAll", query="SELECT t FROM Tipcar t")
public class Tipcar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPCAR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPCAR_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String tipcar;

	public Tipcar() {
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

	public String getTipcar() {
		return this.tipcar;
	}

	public void setTipcar(String tipcar) {
		this.tipcar = tipcar;
	}

}