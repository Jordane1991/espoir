package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Don;

@Repository
public interface DonRepository extends JpaRepository<Don, Integer>{

	@Query("select u from Don u where u.isAccepted = null")
	public List<Don> findDonNotAcceptedYet();
	@Query("select u from Don u where u.isAccepted IS NOT NULL")
	public List<Don> findDonAccepted();
	@Query("select u from Don u where u.isAccepted = 0")
	public List<Don> findDonRefuser();
	@Query("select COUNT(u) from Don u where u.isAccepted = null")
	public int countNotAccepted();
	@Query("select COUNT(u) from Don u where u.isAccepted IS NOT NULL")
	public int countAccepted();
	@Query("select MAX(u.don_id) from Don u")
	public int lastid();
}
