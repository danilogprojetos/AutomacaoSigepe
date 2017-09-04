package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the preporquaven database table.
 * 
 */
@Entity
@NamedQuery(name="Preporquaven.findAll", query="SELECT p FROM Preporquaven p")
public class Preporquaven implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PREPORQUAVEN_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PREPORQUAVEN_COD_GENERATOR")
	private Integer cod;

	private String codbar;

	private double quaven;

	private double valven;

	public Preporquaven() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCodbar() {
		return this.codbar;
	}

	public void setCodbar(String codbar) {
		this.codbar = codbar;
	}

	public double getQuaven() {
		return this.quaven;
	}

	public void setQuaven(double quaven) {
		this.quaven = quaven;
	}

	public double getValven() {
		return this.valven;
	}

	public void setValven(double valven) {
		this.valven = valven;
	}

}