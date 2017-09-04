package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cliente database table.
 * 
 */
@Entity
@NamedQuery(name="Cliente.findAll", query="SELECT c FROM Cliente c")
public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CLIENTE_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CLIENTE_COD_GENERATOR")
	private Integer cod;

	private Integer ativo;

	private String bai;

	private String cep;

	private String cgc;

	private String codcfo;

	private Integer codcid;

	private Integer codgui;

	private Integer codtipclifat;

	private Integer codtipmar;

	private Integer codven;

	private String comlog;

	private String con;

	@Temporal(TemporalType.DATE)
	private Date datcad;

	private String email;

	private String fan;

	private String fax;

	private String fon;

	private String ins;

	private String insprorur;

	private String log;

	private String num;

	private String numficgui;

	private Integer pes;

	private Integer podgerrem;

	private String raz;

	private String rua;

	public Cliente() {
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

	public String getCodcfo() {
		return this.codcfo;
	}

	public void setCodcfo(String codcfo) {
		this.codcfo = codcfo;
	}

	public Integer getCodcid() {
		return this.codcid;
	}

	public void setCodcid(Integer codcid) {
		this.codcid = codcid;
	}

	public Integer getCodgui() {
		return this.codgui;
	}

	public void setCodgui(Integer codgui) {
		this.codgui = codgui;
	}

	public Integer getCodtipclifat() {
		return this.codtipclifat;
	}

	public void setCodtipclifat(Integer codtipclifat) {
		this.codtipclifat = codtipclifat;
	}

	public Integer getCodtipmar() {
		return this.codtipmar;
	}

	public void setCodtipmar(Integer codtipmar) {
		this.codtipmar = codtipmar;
	}

	public Integer getCodven() {
		return this.codven;
	}

	public void setCodven(Integer codven) {
		this.codven = codven;
	}

	public String getComlog() {
		return this.comlog;
	}

	public void setComlog(String comlog) {
		this.comlog = comlog;
	}

	public String getCon() {
		return this.con;
	}

	public void setCon(String con) {
		this.con = con;
	}

	public Date getDatcad() {
		return this.datcad;
	}

	public void setDatcad(Date datcad) {
		this.datcad = datcad;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFan() {
		return this.fan;
	}

	public void setFan(String fan) {
		this.fan = fan;
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

	public String getInsprorur() {
		return this.insprorur;
	}

	public void setInsprorur(String insprorur) {
		this.insprorur = insprorur;
	}

	public String getLog() {
		return this.log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getNumficgui() {
		return this.numficgui;
	}

	public void setNumficgui(String numficgui) {
		this.numficgui = numficgui;
	}

	public Integer getPes() {
		return this.pes;
	}

	public void setPes(Integer pes) {
		this.pes = pes;
	}

	public Integer getPodgerrem() {
		return this.podgerrem;
	}

	public void setPodgerrem(Integer podgerrem) {
		this.podgerrem = podgerrem;
	}

	public String getRaz() {
		return this.raz;
	}

	public void setRaz(String raz) {
		this.raz = raz;
	}

	public String getRua() {
		return this.rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

}