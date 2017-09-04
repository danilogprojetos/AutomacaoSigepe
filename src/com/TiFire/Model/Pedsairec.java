package com.TiFire.Model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pedsairec database table.
 * 
 */
@Entity
@NamedQuery(name="Pedsairec.findAll", query="SELECT p FROM Pedsairec p")
public class Pedsairec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PEDSAIREC_COD_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PEDSAIREC_COD_GENERATOR")
	private Integer cod;

	private Integer codpedsai;

	private Integer codrec;

	public Pedsairec() {
	}

	public Integer getCod() {
		return this.cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Integer getCodpedsai() {
		return this.codpedsai;
	}

	public void setCodpedsai(Integer codpedsai) {
		this.codpedsai = codpedsai;
	}

	public Integer getCodrec() {
		return this.codrec;
	}

	public void setCodrec(Integer codrec) {
		this.codrec = codrec;
	}

}