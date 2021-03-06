package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the carcobcc database table.
 * 
 */
@Entity
@NamedQuery(name="Carcobcc.findAll", query="SELECT c FROM Carcobcc c")
public class Carcobcc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CARCOBCC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CARCOBCC_COD_GENERATOR")
	private Integer cod;

	private String ace;

	private String car;

	private String ced;

	private Integer codcc;

	private String codemp;

	@Temporal(TemporalType.DATE)
	private Date datconhom;

	@Temporal(TemporalType.DATE)
	private Date datpedhom;

	private Integer diabai;

	private Integer diapro;

	private String digced;

	private String emiblo;

	private Integer envemarem;

	private Integer gerrem;

	private Integer hom;

	private byte[] insbol;

	private String liccobbem;

	private String modser;

	private Integer pro;

	private String pronumbol;

	private Integer tipdia;

	private String var;

	public Carcobcc() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getAce() {
		return this.ace;
	}

	public void setAce(String ace) {
		this.ace = ace;
	}

	public String getCar() {
		return this.car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getCed() {
		return this.ced;
	}

	public void setCed(String ced) {
		this.ced = ced;
	}

	public Integer getCodcc() {
		return this.codcc;
	}

	public void setCodcc(Integer codcc) {
		this.codcc = codcc;
	}

	public String getCodemp() {
		return this.codemp;
	}

	public void setCodemp(String codemp) {
		this.codemp = codemp;
	}

	public Date getDatconhom() {
		return this.datconhom;
	}

	public void setDatconhom(Date datconhom) {
		this.datconhom = datconhom;
	}

	public Date getDatpedhom() {
		return this.datpedhom;
	}

	public void setDatpedhom(Date datpedhom) {
		this.datpedhom = datpedhom;
	}

	public Integer getDiabai() {
		return this.diabai;
	}

	public void setDiabai(Integer diabai) {
		this.diabai = diabai;
	}

	public Integer getDiapro() {
		return this.diapro;
	}

	public void setDiapro(Integer diapro) {
		this.diapro = diapro;
	}

	public String getDigced() {
		return this.digced;
	}

	public void setDigced(String digced) {
		this.digced = digced;
	}

	public String getEmiblo() {
		return this.emiblo;
	}

	public void setEmiblo(String emiblo) {
		this.emiblo = emiblo;
	}

	public Integer getEnvemarem() {
		return this.envemarem;
	}

	public void setEnvemarem(Integer envemarem) {
		this.envemarem = envemarem;
	}

	public Integer getGerrem() {
		return this.gerrem;
	}

	public void setGerrem(Integer gerrem) {
		this.gerrem = gerrem;
	}

	public Integer getHom() {
		return this.hom;
	}

	public void setHom(Integer hom) {
		this.hom = hom;
	}

	public byte[] getInsbol() {
		return this.insbol;
	}

	public void setInsbol(byte[] insbol) {
		this.insbol = insbol;
	}

	public String getLiccobbem() {
		return this.liccobbem;
	}

	public void setLiccobbem(String liccobbem) {
		this.liccobbem = liccobbem;
	}

	public String getModser() {
		return this.modser;
	}

	public void setModser(String modser) {
		this.modser = modser;
	}

	public Integer getPro() {
		return this.pro;
	}

	public void setPro(Integer pro) {
		this.pro = pro;
	}

	public String getPronumbol() {
		return this.pronumbol;
	}

	public void setPronumbol(String pronumbol) {
		this.pronumbol = pronumbol;
	}

	public Integer getTipdia() {
		return this.tipdia;
	}

	public void setTipdia(Integer tipdia) {
		this.tipdia = tipdia;
	}

	public String getVar() {
		return this.var;
	}

	public void setVar(String var) {
		this.var = var;
	}

}