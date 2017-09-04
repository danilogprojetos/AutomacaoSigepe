package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mercodbar database table.
 * 
 */
@Entity
@NamedQuery(name="Mercodbar.findAll", query="SELECT m FROM Mercodbar m")
public class Mercodbar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MERCODBAR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MERCODBAR_COD_GENERATOR")
	private Integer cod;

	private String codbar;

	private Integer codmer;

	public Mercodbar() {
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

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

}