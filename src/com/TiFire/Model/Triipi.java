package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the triipi database table.
 * 
 */
@Entity
@NamedQuery(name="Triipi.findAll", query="SELECT t FROM Triipi t")
public class Triipi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRIIPI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRIIPI_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String triipi;

	public Triipi() {
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

	public String getTriipi() {
		return this.triipi;
	}

	public void setTriipi(String triipi) {
		this.triipi = triipi;
	}

}