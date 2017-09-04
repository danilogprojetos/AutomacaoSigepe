package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tpclifat database table.
 * 
 */
@Entity
@NamedQuery(name="Tpclifat.findAll", query="SELECT t FROM Tpclifat t")
public class Tpclifat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TPCLIFAT_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TPCLIFAT_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private Integer ipisombascal;

	private String tipclifat;

	public Tpclifat() {
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

	public Integer getIpisombascal() {
		return this.ipisombascal;
	}

	public void setIpisombascal(Integer ipisombascal) {
		this.ipisombascal = ipisombascal;
	}

	public String getTipclifat() {
		return this.tipclifat;
	}

	public void setTipclifat(String tipclifat) {
		this.tipclifat = tipclifat;
	}

}