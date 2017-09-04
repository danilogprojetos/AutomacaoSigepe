package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the reqmat database table.
 * 
 */
@Entity
@NamedQuery(name="Reqmat.findAll", query="SELECT r FROM Reqmat r")
public class Reqmat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="REQMAT_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="REQMAT_COD_GENERATOR")
	private Integer cod;

	private Integer codcat;

	private Integer codcencus;

	private Integer codpedent;

	private Integer codpedpro;

	private Integer codpedsai;

	private Integer codplacon;

	private Integer codresmer;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date dat;

	private String entsai;

	private Time hor;

	private String ope;

	private Integer pen;

	public Reqmat() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodcat() {
		return this.codcat;
	}

	public void setCodcat(Integer codcat) {
		this.codcat = codcat;
	}

	public Integer getCodcencus() {
		return this.codcencus;
	}

	public void setCodcencus(Integer codcencus) {
		this.codcencus = codcencus;
	}

	public Integer getCodpedent() {
		return this.codpedent;
	}

	public void setCodpedent(Integer codpedent) {
		this.codpedent = codpedent;
	}

	public Integer getCodpedpro() {
		return this.codpedpro;
	}

	public void setCodpedpro(Integer codpedpro) {
		this.codpedpro = codpedpro;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Integer getCodplacon() {
		return this.codplacon;
	}

	public void setCodplacon(Integer codplacon) {
		this.codplacon = codplacon;
	}

	public Integer getCodresmer() {
		return this.codresmer;
	}

	public void setCodresmer(Integer codresmer) {
		this.codresmer = codresmer;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDat() {
		return this.dat;
	}

	public void setDat(Date dat) {
		this.dat = dat;
	}

	public String getEntsai() {
		return this.entsai;
	}

	public void setEntsai(String entsai) {
		this.entsai = entsai;
	}

	public Time getHor() {
		return this.hor;
	}

	public void setHor(Time hor) {
		this.hor = hor;
	}

	public String getOpe() {
		return this.ope;
	}

	public void setOpe(String ope) {
		this.ope = ope;
	}

	public Integer getPen() {
		return this.pen;
	}

	public void setPen(Integer pen) {
		this.pen = pen;
	}

}