package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the labexa database table.
 * 
 */
@Entity
@NamedQuery(name="Labexa.findAll", query="SELECT l FROM Labexa l")
public class Labexa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="LABEXA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LABEXA_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String bai;

	private String fon;

	private String labexa;

	private String rua;

	public Labexa() {
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

	public String getBai() {
		return this.bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}

	public String getFon() {
		return this.fon;
	}

	public void setFon(String fon) {
		this.fon = fon;
	}

	public String getLabexa() {
		return this.labexa;
	}

	public void setLabexa(String labexa) {
		this.labexa = labexa;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}