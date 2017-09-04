package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the conlog database table.
 * 
 */
@Entity
@NamedQuery(name="Conlog.findAll", query="SELECT c FROM Conlog c")
public class Conlog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CONLOG_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CONLOG_COD_GENERATOR")
	private Integer cod;

	private String ope;

	private String tipmov;

	public Conlog() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getOpe() {
		return this.ope;
	}

	public void setOpe(String ope) {
		this.ope = ope;
	}

	public String getTipmov() {
		return this.tipmov;
	}

	public void setTipmov(String tipmov) {
		this.tipmov = tipmov;
	}

}