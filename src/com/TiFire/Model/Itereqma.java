package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the itereqma database table.
 * 
 */
@Entity
@NamedQuery(name="Itereqma.findAll", query="SELECT i FROM Itereqma i")
public class Itereqma implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEREQMA_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEREQMA_COD_GENERATOR")
	private Integer cod;

	private Integer coditeresmer;

	private Integer codmer;

	private Integer codmermas;

	private Integer codplacon;

	private Integer codreqmat;

	private double qua;

	private double val;

	public Itereqma() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditeresmer() {
		return this.coditeresmer;
	}

	public void setCoditeresmer(Integer coditeresmer) {
		this.coditeresmer = coditeresmer;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodmermas() {
		return this.codmermas;
	}

	public void setCodmermas(Integer codmermas) {
		this.codmermas = codmermas;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Integer getCodreqmat() {
		return this.codreqmat;
	}

	public void setCodreqmat(Integer codreqmat) {
		this.codreqmat = codreqmat;
	}

	public double getQua() {
		return this.qua;
	}

	public void setQua(double qua) {
		this.qua = qua;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

}