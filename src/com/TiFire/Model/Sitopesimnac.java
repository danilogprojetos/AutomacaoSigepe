package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sitopesimnac database table.
 * 
 */
@Entity
@NamedQuery(name="Sitopesimnac.findAll", query="SELECT s FROM Sitopesimnac s")
public class Sitopesimnac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SITOPESIMNAC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SITOPESIMNAC_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String sitopesimnac;

	public Sitopesimnac() {
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

	public String getSitopesimnac() {
		return this.sitopesimnac;
	}

	public void setSitopesimnac(String sitopesimnac) {
		this.sitopesimnac = sitopesimnac;
	}

}