package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rom database table.
 * 
 */
@Entity
@NamedQuery(name="Rom.findAll", query="SELECT r FROM Rom r")
public class Rom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROM_COD_GENERATOR")
	private Integer cod;

	private String rom;

	public Rom() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getRom() {
		return this.rom;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

}