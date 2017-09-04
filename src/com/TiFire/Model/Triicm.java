package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the triicm database table.
 * 
 */
@Entity
@NamedQuery(name="Triicm.findAll", query="SELECT t FROM Triicm t")
public class Triicm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TRIICM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TRIICM_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String triicm;

	public Triicm() {
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

	public String getTriicm() {
		return this.triicm;
	}

	public void setTriicm(String triicm) {
		this.triicm = triicm;
	}

}