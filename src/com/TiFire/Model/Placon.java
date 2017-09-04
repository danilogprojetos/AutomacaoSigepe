package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the placon database table.
 * 
 */
@Entity
@NamedQuery(name="Placon.findAll", query="SELECT p FROM Placon p")
public class Placon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PLACON_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PLACON_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private Integer blo;

	private Integer coddemresexe;

	private Integer codorddre;

	private Integer codplacon;

	private String codseq;

	private String credeb;

	private String placon;

	public Placon() {
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

	public Integer getBlo() {
		return this.blo;
	}

	public void setBlo(Integer blo) {
		this.blo = blo;
	}

	public Integer getCoddemresexe() {
		return this.coddemresexe;
	}

	public void setCoddemresexe(Integer coddemresexe) {
		this.coddemresexe = coddemresexe;
	}

	public Integer getCodorddre() {
		return this.codorddre;
	}

	public void setCodorddre(Integer codorddre) {
		this.codorddre = codorddre;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public String getCodseq() {
		return this.codseq;
	}

	public void setCodseq(String codseq) {
		this.codseq = codseq;
	}

	public String getCredeb() {
		return this.credeb;
	}

	public void setCredeb(String credeb) {
		this.credeb = credeb;
	}

	public String getPlacon() {
		return this.placon;
	}

	public void setPlacon(String placon) {
		this.placon = placon;
	}

}