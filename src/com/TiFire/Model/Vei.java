package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the vei database table.
 * 
 */
@Entity
@NamedQuery(name="Vei.findAll", query="SELECT v FROM Vei v")
public class Vei implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VEI_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VEI_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private double capmetcub;

	private double capqui;

	private String cgcpro;

	private Integer codtipcar;

	private Integer codtippro;

	private Integer codtiprod;

	private String codunifed;

	private String codunifedpro;

	private String insestpro;

	private String nompro;

	private String pla;

	private String regnactrarodcarpro;

	private String ren;

	private double tar;

	private String vei;

	public Vei() {
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

	public double getCapmetcub() {
		return this.capmetcub;
	}

	public void setCapmetcub(double capmetcub) {
		this.capmetcub = capmetcub;
	}

	public double getCapqui() {
		return this.capqui;
	}

	public void setCapqui(double capqui) {
		this.capqui = capqui;
	}

	public String getCgcpro() {
		return this.cgcpro;
	}

	public void setCgcpro(String cgcpro) {
		this.cgcpro = cgcpro;
	}

	public Integer getCodtipcar() {
		return this.codtipcar;
	}

	public void setCodtipcar(Integer codtipcar) {
		this.codtipcar = codtipcar;
	}

	public Integer getCodtippro() {
		return this.codtippro;
	}

	public void setCodtippro(Integer codtippro) {
		this.codtippro = codtippro;
	}

	public Integer getCodtiprod() {
		return this.codtiprod;
	}

	public void setCodtiprod(Integer codtiprod) {
		this.codtiprod = codtiprod;
	}

	public String getCodunifed() {
		return this.codunifed;
	}

	public void setCodunifed(String codunifed) {
		this.codunifed = codunifed;
	}

	public String getCodunifedpro() {
		return this.codunifedpro;
	}

	public void setCodunifedpro(String codunifedpro) {
		this.codunifedpro = codunifedpro;
	}

	public String getInsestpro() {
		return this.insestpro;
	}

	public void setInsestpro(String insestpro) {
		this.insestpro = insestpro;
	}

	public String getNompro() {
		return this.nompro;
	}

	public void setNompro(String nompro) {
		this.nompro = nompro;
	}

	public String getPla() {
		return this.pla;
	}

	public void setPla(String pla) {
		this.pla = pla;
	}

	public String getRegnactrarodcarpro() {
		return this.regnactrarodcarpro;
	}

	public void setRegnactrarodcarpro(String regnactrarodcarpro) {
		this.regnactrarodcarpro = regnactrarodcarpro;
	}

	public String getRen() {
		return this.ren;
	}

	public void setRen(String ren) {
		this.ren = ren;
	}

	public double getTar() {
		return this.tar;
	}

	public void setTar(double tar) {
		this.tar = tar;
	}

	public String getVei() {
		return this.vei;
	}

	public void setVei(String vei) {
		this.vei = vei;
	}

}