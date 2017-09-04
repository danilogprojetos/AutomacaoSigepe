package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the vendedor database table.
 * 
 */
@Entity
@NamedQuery(name="Vendedor.findAll", query="SELECT v FROM Vendedor v")
public class Vendedor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VENDEDOR_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VENDEDOR_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String bai;

	private String cel;

	private String cep;

	private String cgc;

	private Integer codcid;

	private Integer codfor;

	private Integer codusu;

	@Temporal(TemporalType.DATE)
	private Date datiniext;

	private String email;

	private String fax;

	private String fon;

	private String ins;

	private byte[] obs;

	private double porcom;

	private String rua;

	private double saliniext;

	private String ven;

	public Vendedor() {
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

	public String getBai() {
		return this.bai;
	}

	public void setBai(String bai) {
		this.bai = bai;
	}

	public String getCel() {
		return this.cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	public Integer getCodcid() {
		return this.codcid;
	}

	public void setCodcid(Integer codcid) {
		this.codcid = codcid;
	}

	public Integer getCodfor() {
		return this.codfor;
	}

	public void setCodfor(Integer codfor) {
		this.codfor = codfor;
	}

	public Integer getCodusu() {
		return this.codusu;
	}

	public void setCodusu(Integer codusu) {
		this.codusu = codusu;
	}

	public Date getDatiniext() {
		return this.datiniext;
	}

	public void setDatiniext(Date datiniext) {
		this.datiniext = datiniext;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFon() {
		return this.fon;
	}

	public void setFon(String fon) {
		this.fon = fon;
	}

	public String getIns() {
		return this.ins;
	}

	public void setIns(String ins) {
		this.ins = ins;
	}

	public byte[] getObs() {
		return this.obs;
	}

	public void setObs(byte[] obs) {
		this.obs = obs;
	}

	public double getPorcom() {
		return this.porcom;
	}

	public void setPorcom(double porcom) {
		this.porcom = porcom;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public double getSaliniext() {
		return this.saliniext;
	}

	public void setSaliniext(double saliniext) {
		this.saliniext = saliniext;
	}

	public String getVen() {
		return this.ven;
	}

	public void setVen(String ven) {
		this.ven = ven;
	}

}