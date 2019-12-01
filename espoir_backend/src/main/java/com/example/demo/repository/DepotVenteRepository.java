package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.DepotVente;

public interface DepotVenteRepository extends JpaRepository<DepotVente, Integer> {
	@Query("select MAX(u.depot_id) from DepotVente u")
	public int lastid();
}
