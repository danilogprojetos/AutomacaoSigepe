package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clafiscfo database table.
 * 
 */
@Entity
@NamedQuery(name="Clafiscfo.findAll", query="SELECT c FROM Clafiscfo c")
public class Clafiscfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLAFISCFO_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLAFISCFO_COD_GENERATOR")
	private Integer cod;

	private String cfo;

	private String codclafis;

	public Clafiscfo() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getCfo() {
		return this.cfo;
	}

	public void setCfo(String cfo) {
		this.cfo = cfo;
	}

	public String getCodclafis() {
		return this.codclafis;
	}

	public void setCodclafis(String codclafis) {
		this.codclafis = codclafis;
	}

}