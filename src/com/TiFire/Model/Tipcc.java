package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tipcc database table.
 * 
 */
@Entity
@NamedQuery(name="Tipcc.findAll", query="SELECT t FROM Tipcc t")
public class Tipcc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPCC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPCC_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private Integer codplacon;

	private String debcre;

	private String des;

	private String tipcc;

	public Tipcc() {
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

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
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

	public String getTipcc() {
		return this.tipcc;
	}

	public void setTipcc(String tipcc) {
		this.tipcc = tipcc;
	}

}