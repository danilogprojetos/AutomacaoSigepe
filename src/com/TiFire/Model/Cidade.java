package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cidade database table.
 * 
 */
@Entity
@NamedQuery(name="Cidade.findAll", query="SELECT c FROM Cidade c")
public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CIDADE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CIDADE_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String cepgercid;

	private String cid;

	private Integer codciddim;

	private Integer codibg;

	private Integer codpai;

	private Integer codreg;

	private String tipo;

	private String uf;

	public Cidade() {
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

	public String getCepgercid() {
		return this.cepgercid;
	}

	public void setCepgercid(String cepgercid) {
		this.cepgercid = cepgercid;
	}

	public String getCid() {
		return this.cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public Integer getCodciddim() {
		return this.codciddim;
	}

	public void setCodciddim(Integer codciddim) {
		this.codciddim = codciddim;
	}

	public Integer getCodibg() {
		return this.codibg;
	}

	public void setCodibg(Integer codibg) {
		this.codibg = codibg;
	}

	public Integer getCodpai() {
		return this.codpai;
	}

	public void setCodpai(Integer codpai) {
		this.codpai = codpai;
	}

	public Integer getCodreg() {
		return this.codreg;
	}

	public void setCodreg(Integer codreg) {
		this.codreg = codreg;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}