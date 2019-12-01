package com.example.demo.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DepotVente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int depot_id ;
	@Temporal(TemporalType.DATE)
	private Date dateDepot;
	
	private float montant;
	@Temporal(TemporalType.DATE)
	private Date dateVenteDepot;
	
	private float montantVente;
	
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="don_id")
	private Don don;
    
    
	public DepotVente() {
		super();
	}

	public DepotVente(int depot_id, Date dateDepot, float montant, Date dateVenteDepot, float montantVente) {
		super();
		this.depot_id = depot_id;
		this.dateDepot = dateDepot;
		this.montant = montant;
		this.dateVenteDepot = dateVenteDepot;
		this.montantVente = montantVente;
	}

	public int getDepot_id() {
		return depot_id;
	}

	public void setDepot_id(int depot_id) {
		this.depot_id = depot_id;
	}

	public Date getDateDepot() {
		return dateDepot;
	}

	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Date getDateVenteDepot() {
		return dateVenteDepot;
	}

	public void setDateVenteDepot(Date dateVenteDepot) {
		this.dateVenteDepot = dateVenteDepot;
	}

	public float getMontantVente() {
		return montantVente;
	}

	public void setMontantVente(float montantVente) {
		this.montantVente = montantVente;
	}

	public Don getDon() {
		return don;
	}

	public void setDon(Don don) {
		this.don = don;
	}


    
    
}
