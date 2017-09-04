package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the valpedmdf database table.
 * 
 */
@Entity
@NamedQuery(name="Valpedmdf.findAll", query="SELECT v FROM Valpedmdf v")
public class Valpedmdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VALPEDMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VALPEDMDF_COD_GENERATOR")
	private Integer cod;

	private String cgcfor;

	private String cgcres;

	private Integer codmandocfis;

	private String numcom;

	public Valpedmdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCgcfor() {
		return this.cgcfor;
	}

	public void setCgcfor(String cgcfor) {
		this.cgcfor = cgcfor;
	}

	public String getCgcres() {
		return this.cgcres;
	}

	public void setCgcres(String cgcres) {
		this.cgcres = cgcres;
	}

	public Integer getCodmandocfis() {
		return this.codmandocfis;
	}

	public void setCodmandocfis(Integer codmandocfis) {
		this.codmandocfis = codmandocfis;
	}

	public String getNumcom() {
		return this.numcom;
	}

	public void setNumcom(String numcom) {
		this.numcom = numcom;
	}

}