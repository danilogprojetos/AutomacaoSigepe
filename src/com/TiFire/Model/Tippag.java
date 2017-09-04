package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tippag database table.
 * 
 */
@Entity
@NamedQuery(name="Tippag.findAll", query="SELECT t FROM Tippag t")
public class Tippag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPPAG_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPPAG_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String tippag;

	public Tippag() {
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

	public String getTippag() {
		return this.tippag;
	}

	public void setTippag(String tippag) {
		this.tippag = tippag;
	}

}