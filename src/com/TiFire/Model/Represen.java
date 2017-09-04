package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the represen database table.
 * 
 */
@Entity
@NamedQuery(name="Represen.findAll", query="SELECT r FROM Represen r")
public class Represen implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REPRESEN_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REPRESEN_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String cel;

	private String cpf;

	private String email;

	private String rep;

	private String rg;

	private String tel;

	public Represen() {
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

	public String getCel() {
		return this.cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRep() {
		return this.rep;
	}

	public void setRep(String rep) {
		this.rep = rep;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}