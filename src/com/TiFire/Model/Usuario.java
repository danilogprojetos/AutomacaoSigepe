package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USUARIO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USUARIO_COD_GENERATOR")
	private Integer cod;

	private String log;

	private String sen;

	private String usu;

	public Usuario() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getSen() {
		return this.sen;
	}

	public void setSen(String sen) {
		this.sen = sen;
	}

	public String getUsu() {
		return this.usu;
	}

	public void setUsu(String usu) {
		this.usu = usu;
	}

}