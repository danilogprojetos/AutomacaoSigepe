package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the modmdf database table.
 * 
 */
@Entity
@NamedQuery(name="Modmdf.findAll", query="SELECT m FROM Modmdf m")
public class Modmdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MODMDF_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MODMDF_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String modmdf;

	public Modmdf() {
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

	public String getModmdf() {
		return this.modmdf;
	}

	public void setModmdf(String modmdf) {
		this.modmdf = modmdf;
	}

}