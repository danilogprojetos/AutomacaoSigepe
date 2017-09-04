package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the secmer database table.
 * 
 */
@Entity
@NamedQuery(name="Secmer.findAll", query="SELECT s FROM Secmer s")
public class Secmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SECMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SECMER_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String secmer;

	private Integer tip;

	public Secmer() {
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

	public String getSecmer() {
		return this.secmer;
	}

	public void setSecmer(String secmer) {
		this.secmer = secmer;
	}

	public Integer getTip() {
		return this.tip;
	}

	public void setTip(Integer tip) {
		this.tip = tip;
	}

}