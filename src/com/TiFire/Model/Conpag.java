package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conpag database table.
 * 
 */
@Entity
@NamedQuery(name="Conpag.findAll", query="SELECT c FROM Conpag c")
public class Conpag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONPAG_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONPAG_COD_GENERATOR")
	private Integer cod;

	private String conpag;

	private Integer ord;

	private double por;

	private String tip;

	public Conpag() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getConpag() {
		return this.conpag;
	}

	public void setConpag(String conpag) {
		this.conpag = conpag;
	}

	public Integer getOrd() {
		return this.ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

	public double getPor() {
		return this.por;
	}

	public void setPor(double por) {
		this.por = por;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

}