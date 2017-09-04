package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipunitra database table.
 * 
 */
@Entity
@NamedQuery(name="Tipunitra.findAll", query="SELECT t FROM Tipunitra t")
public class Tipunitra implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPUNITRA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPUNITRA_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String tipunitra;

	public Tipunitra() {
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

	public String getTipunitra() {
		return this.tipunitra;
	}

	public void setTipunitra(String tipunitra) {
		this.tipunitra = tipunitra;
	}

}