package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the demresexe database table.
 * 
 */
@Entity
@NamedQuery(name="Demresexe.findAll", query="SELECT d FROM Demresexe d")
public class Demresexe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEMRESEXE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEMRESEXE_COD_GENERATOR")
	private Integer cod;

	private String cal;

	private String demresexe;

	private Integer ord;

	public Demresexe() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCal() {
		return this.cal;
	}

	public void setCal(String cal) {
		this.cal = cal;
	}

	public String getDemresexe() {
		return this.demresexe;
	}

	public void setDemresexe(String demresexe) {
		this.demresexe = demresexe;
	}

	public Integer getOrd() {
		return this.ord;
	}

	public void setOrd(Integer ord) {
		this.ord = ord;
	}

}