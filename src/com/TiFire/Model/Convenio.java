package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the convenio database table.
 * 
 */
@Entity
@NamedQuery(name="Convenio.findAll", query="SELECT c FROM Convenio c")
public class Convenio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONVENIO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONVENIO_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private Integer codplacon;

	private String con;

	public Convenio() {
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

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
	}

}