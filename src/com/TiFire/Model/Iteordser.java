package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteordser database table.
 * 
 */
@Entity
@NamedQuery(name="Iteordser.findAll", query="SELECT i FROM Iteordser i")
public class Iteordser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEORDSER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEORDSER_COD_GENERATOR")
	private Integer cod;

	private Integer codmer;

	private Integer codordser;

	private byte[] obs;

	private double qua;

	private double val;

	public Iteordser() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodordser() {
		return this.codordser;
	}

	public void setCodordser(Integer codordser) {
		this.codordser = codordser;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
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