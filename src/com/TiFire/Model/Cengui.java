package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cengui database table.
 * 
 */
@Entity
@NamedQuery(name="Cengui.findAll", query="SELECT c FROM Cengui c")
public class Cengui implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CENGUI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CENGUI_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String cengui;

	public Cengui() {
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

	public String getCengui() {
		return this.cengui;
	}

	public void setCengui(String cengui) {
		this.cengui = cengui;
	}

}