package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tiprec database table.
 * 
 */
@Entity
@NamedQuery(name="Tiprec.findAll", query="SELECT t FROM Tiprec t")
public class Tiprec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TIPREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TIPREC_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String tiprec;

	public Tiprec() {
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

	public String getTiprec() {
		return this.tiprec;
	}

	public void setTiprec(String tiprec) {
		this.tiprec = tiprec;
	}

}