package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipcai database table.
 * 
 */
@Entity
@NamedQuery(name="Tipcai.findAll", query="SELECT t FROM Tipcai t")
public class Tipcai implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPCAI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPCAI_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String debcre;

	private String des;

	private String tipcai;

	public Tipcai() {
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

	public String getDebcre() {
		return this.debcre;
	}

	public void setDebcre(String debcre) {
		this.debcre = debcre;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getTipcai() {
		return this.tipcai;
	}

	public void setTipcai(String tipcai) {
		this.tipcai = tipcai;
	}

}