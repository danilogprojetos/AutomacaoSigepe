package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the hisvalcusmer database table.
 * 
 */
@Entity
@NamedQuery(name="Hisvalcusmer.findAll", query="SELECT h FROM Hisvalcusmer h")
public class Hisvalcusmer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="HISVALCUSMER_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="HISVALCUSMER_COD_GENERATOR")
	private Integer cod;

	private Integer codmer;

	@Temporal(TemporalType.DATE)
	private Date datalt;

	private double valcus;

	public Hisvalcusmer() {
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

	public Date getDatalt() {
		return this.datalt;
	}

	public void setDatalt(Date datalt) {
		this.datalt = datalt;
	}

	public double getValcus() {
		return this.valcus;
	}

	public void setValcus(double valcus) {
		this.valcus = valcus;
	}

}