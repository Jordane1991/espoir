package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.model.VenteBiAnnuelle;
import com.example.demo.repository.VenteBiAnnuelleRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("VenteBiAnnu")
public class VenteBiAnnuelleRest {
	
	@Autowired
	public VenteBiAnnuelleRepository  ventebiannuellerepository;
	
	@GetMapping("/")
	public List<VenteBiAnnuelle > getAll()
	{
		return ventebiannuellerepository.findAll();
	}
	
	@PostMapping("saveVente")
	public void save(@RequestBody VenteBiAnnuelle VenteAnnuelle)throws Exception
	{
		ventebiannuellerepository.save(VenteAnnuelle);
	}
	
	@GetMapping("{id}")
	public VenteBiAnnuelle finByid(@PathVariable int id)
		{
			return ventebiannuellerepository.findById(id).get();
		}
	
	@DeleteMapping("deleteVente/{id}")
	public void delete(@PathVariable int id)
	{
		ventebiannuellerepository.deleteById(id);
	}
	
	@PutMapping("editVente/{id}")
	public void update(@PathVariable int id, @RequestBody VenteBiAnnuelle VenteBiAnnu)
	{
		VenteBiAnnu.setVente_id(id);
		ventebiannuellerepository.save(VenteBiAnnu);
	}

	
}
