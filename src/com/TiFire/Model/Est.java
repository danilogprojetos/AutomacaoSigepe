package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the est database table.
 * 
 */
@Entity
@NamedQuery(name="Est.findAll", query="SELECT e FROM Est e")
public class Est implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="EST_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EST_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String est;

	public Est() {
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

	public String getEst() {
		return this.est;
	}

	public void setEst(String est) {
		this.est = est;
	}

}