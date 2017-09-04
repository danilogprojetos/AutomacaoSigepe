package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the esp database table.
 * 
 */
@Entity
@NamedQuery(name="Esp.findAll", query="SELECT e FROM Esp e")
public class Esp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ESP_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ESP_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String esp;

	public Esp() {
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

	public String getEsp() {
		return this.esp;
	}

	public void setEsp(String esp) {
		this.esp = esp;
	}

}