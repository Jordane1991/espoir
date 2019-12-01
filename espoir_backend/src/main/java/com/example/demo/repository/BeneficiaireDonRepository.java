package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BeneficiareDon;

@Repository
public interface BeneficiaireDonRepository extends JpaRepository<BeneficiareDon, Integer>{

}
