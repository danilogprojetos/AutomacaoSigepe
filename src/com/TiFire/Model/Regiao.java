package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the regiao database table.
 * 
 */
@Entity
@NamedQuery(name="Regiao.findAll", query="SELECT r FROM Regiao r")
public class Regiao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REGIAO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REGIAO_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String reg;

	public Regiao() {
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

	public String getReg() {
		return this.reg;
	}

	public void setReg(String reg) {
		this.reg = reg;
	}

}