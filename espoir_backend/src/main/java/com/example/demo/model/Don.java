package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Don {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int don_id ;
	@Temporal(TemporalType.DATE)
	private Date dateReception;
	private String type;
	private String reference;
	private String nomDonateur;
	private String tel;
	private String adresse;
	private String description;
	@Temporal(TemporalType.DATE)
	private Date dataAcceptation;
	private String MembreAssociation;
	@Temporal(TemporalType.DATE)
	private Date DateTransport;
	private String transporteur;
	private String vehicules;
	private String LieuStockage;
	private Boolean isAccepted;
	private String photo;
    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name="user_id")
	private User user;

	
	
	
	public Don() {
		super();
	}

	
	
	public Don(int don_id, Date dateReception, String type, String reference, String nomDonateur, String tel,
			String adresse, String description, String photo) {
		super();
		this.don_id = don_id;
		this.dateReception = dateReception;
		this.type = type;
		this.reference = reference;
		this.nomDonateur = nomDonateur;
		this.tel = tel;
		this.adresse = adresse;
		this.description = description;
		this.photo = photo ;
	}



	public int getDon_id() {
		return don_id;
	}

	public void setDon_id(int don_id) {
		this.don_id = don_id;
	}

	public Date getDateReception() {
		return dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getNomDonateur() {
		return nomDonateur;
	}

	public void setNomDonateur(String nomDonateur) {
		this.nomDonateur = nomDonateur;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDataAcceptation() {
		return dataAcceptation;
	}

	public void setDataAcceptation(Date dataAcceptation) {
		this.dataAcceptation = dataAcceptation;
	}

	public String getMembreAssociation() {
		return MembreAssociation;
	}

	public void setMembreAssociation(String membreAssociation) {
		MembreAssociation = membreAssociation;
	}

	public Date getDateTransport() {
		return DateTransport;
	}

	public void setDateTransport(Date dateTransport) {
		DateTransport = dateTransport;
	}

	public String getTransporteur() {
		return transporteur;
	}

	public void setTransporteur(String transporteur) {
		this.transporteur = transporteur;
	}

	public String getVehicules() {
		return vehicules;
	}

	public void setVehicules(String vehicules) {
		this.vehicules = vehicules;
	}

	public String getLieuStockage() {
		return LieuStockage;
	}

	public void setLieuStockage(String lieuStockage) {
		LieuStockage = lieuStockage;
	}

	public Boolean getIsAccepted() {
		return isAccepted;
	}

	public void setIsAccepted(Boolean isAccepted) {
		this.isAccepted = isAccepted;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}



	public String getPhoto() {
		return photo;
	}



	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	
	
	
	
}
