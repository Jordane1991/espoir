package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BeneficiareDon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ben_id;
	String demandeur;
	String beneficiaire;
	Long telephone; 
	String adresse;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="don_id")
	private Don don;
	
	
	
	
	
	public BeneficiareDon(int ben_id, String demandeur, String beneficiaire, Long telephone, String adresse, Don don) {
		super();
		this.ben_id = ben_id;
		this.demandeur = demandeur;
		this.beneficiaire = beneficiaire;
		this.telephone = telephone;
		this.adresse = adresse;
		this.don = don;
	}

	public int getBen_id() {
		return ben_id;
	}

	public void setBen_id(int ben_id) {
		this.ben_id = ben_id;
	}

	public BeneficiareDon() {
		super();
		
	}
	

	public String getDemandeur() {
		return demandeur;
	}
	public void setDemandeur(String demandeur) {
		this.demandeur = demandeur;
	}
	public String getBeneficiaire() {
		return beneficiaire;
	}
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}
	public Long getTelephone() {
		return telephone;
	}
	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Don getDon() {
		return don;
	}
	public void setDon(Don don) {
		this.don = don;
	}
	
}
