package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prerevcl database table.
 * 
 */
@Entity
@NamedQuery(name="Prerevcl.findAll", query="SELECT p FROM Prerevcl p")
public class Prerevcl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PREREVCL_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PREREVCL_COD_GENERATOR")
	private Integer cod;

	private Integer arr;

	private Integer codcli;

	private double porrea;

	private String tip;

	private double valfin;

	private double valini;

	public Prerevcl() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getArr() {
		return this.arr;
	}

	public void setArr(Integer arr) {
		this.arr = arr;
	}

	public Integer getCodcli() {
		return this.codcli;
	}

	public void setCodcli(Integer codcli) {
		this.codcli = codcli;
	}

	public double getPorrea() {
		return this.porrea;
	}

	public void setPorrea(double porrea) {
		this.porrea = porrea;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public double getValfin() {
		return this.valfin;
	}

	public void setValfin(double valfin) {
		this.valfin = valfin;
	}

	public double getValini() {
		return this.valini;
	}

	public void setValini(double valini) {
		this.valini = valini;
	}

}