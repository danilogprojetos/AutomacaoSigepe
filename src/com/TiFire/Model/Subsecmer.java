package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subsecmer database table.
 * 
 */
@Entity
@NamedQuery(name="Subsecmer.findAll", query="SELECT s FROM Subsecmer s")
public class Subsecmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SUBSECMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SUBSECMER_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String subsecmer;

	public Subsecmer() {
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

	public String getSubsecmer() {
		return this.subsecmer;
	}

	public void setSubsecmer(String subsecmer) {
		this.subsecmer = subsecmer;
	}

}