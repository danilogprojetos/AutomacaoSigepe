package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the iteordcom database table.
 * 
 */
@Entity
@NamedQuery(name="Iteordcom.findAll", query="SELECT i FROM Iteordcom i")
public class Iteordcom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ITEORDCOM_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ITEORDCOM_COD_GENERATOR")
	private Integer cod;

	private Integer coditeordcom;

	private Integer codmer;

	private Integer codordcom;

	private byte[] obs;

	private double qua;

	private double quaent;

	private double quaped;

	private double val;

	private double valcus;

	public Iteordcom() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCoditeordcom() {
		return this.coditeordcom;
	}

	public void setCoditeordcom(Integer coditeordcom) {
		this.coditeordcom = coditeordcom;
	}

	public Integer getCodmer() {
		return this.codmer;
	}

	public void setCodmer(Integer codmer) {
		this.codmer = codmer;
	}

	public Integer getCodordcom() {
		return this.codordcom;
	}

	public void setCodordcom(Integer codordcom) {
		this.codordcom = codordcom;
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

	public double getQuaent() {
		return this.quaent;
	}

	public void setQuaent(double quaent) {
		this.quaent = quaent;
	}

	public double getQuaped() {
		return this.quaped;
	}

	public void setQuaped(double quaped) {
		this.quaped = quaped;
	}

	public double getVal() {
		return this.val;
	}

	public void setVal(double val) {
		this.val = val;
	}

	public double getValcus() {
		return this.valcus;
	}

	public void setValcus(double valcus) {
		this.valcus = valcus;
	}

}