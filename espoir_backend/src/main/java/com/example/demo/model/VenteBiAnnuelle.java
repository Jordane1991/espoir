package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class VenteBiAnnuelle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vente_id ;
	private float montant_estime ;
	private float montant_obtenu ;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="don_id")
	private Don don;

	public int getVente_id() {
		return vente_id;
	}

	public void setVente_id(int vente_id) {
		this.vente_id = vente_id;
	}

	public float getMontant_estime() {
		return montant_estime;
	}

	public void setMontant_estime(float montant_estime) {
		this.montant_estime = montant_estime;
	}

	public float getMontant_obtenu() {
		return montant_obtenu;
	}

	public void setMontant_obtenu(float montant_obtenu) {
		this.montant_obtenu = montant_obtenu;
	}

	public Don getDon() {
		return don;
	}

	public void setDon(Don don) {
		this.don = don;
	}

	public VenteBiAnnuelle(int vente_id, float montant_estime, float montant_obtenu, Don don) {
		super();
		this.vente_id = vente_id;
		this.montant_estime = montant_estime;
		this.montant_obtenu = montant_obtenu;
		this.don = don;
	}

	public VenteBiAnnuelle() {
		super();
		// TODO Auto-generated constructor stub
	}
   
}
