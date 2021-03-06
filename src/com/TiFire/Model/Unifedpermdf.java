package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unifedpermdf database table.
 * 
 */
@Entity
@NamedQuery(name="Unifedpermdf.findAll", query="SELECT u FROM Unifedpermdf u")
public class Unifedpermdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="UNIFEDPERMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="UNIFEDPERMDF_COD_GENERATOR")
	private Integer cod;

	private Integer codmandocfis;

	private String coduf;

	public Unifedpermdf() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmandocfis() {
		return this.codmandocfis;
	}

	public void setCodmandocfis(Integer codmandocfis) {
		this.codmandocfis = codmandocfis;
	}

	public String getCoduf() {
		return this.coduf;
	}

	public void setCoduf(String coduf) {
		this.coduf = coduf;
	}

}