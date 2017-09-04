package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orimer database table.
 * 
 */
@Entity
@NamedQuery(name="Orimer.findAll", query="SELECT o FROM Orimer o")
public class Orimer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ORIMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ORIMER_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String orimer;

	public Orimer() {
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

	public String getOrimer() {
		return this.orimer;
	}

	public void setOrimer(String orimer) {
		this.orimer = orimer;
	}

}