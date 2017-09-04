package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the banco database table.
 * 
 */
@Entity
@NamedQuery(name="Banco.findAll", query="SELECT b FROM Banco b")
public class Banco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="BANCO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BANCO_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String ban;

	private double poradm;

	public Banco() {
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

	public String getBan() {
		return this.ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public double getPoradm() {
		return this.poradm;
	}

	public void setPoradm(double poradm) {
		this.poradm = poradm;
	}

}