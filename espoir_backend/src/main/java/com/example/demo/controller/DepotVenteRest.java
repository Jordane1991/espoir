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

import com.example.demo.model.DepotVente;
import com.example.demo.model.Don;
import com.example.demo.repository.DepotVenteRepository;



@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("deptVente")
public class DepotVenteRest {

	@Autowired
	public DepotVenteRepository depotVenteRepository;
	
	@GetMapping("/")
	public List<DepotVente> getAll()
	{
		return depotVenteRepository.findAll();
	}
	
	@PostMapping("save")
	public void save(@RequestBody DepotVente depotVente)throws Exception
	{
		depotVenteRepository.save(depotVente);
	}
	
	@GetMapping("{id}")
	public DepotVente finByid(@PathVariable int id)
		{
			return depotVenteRepository.findById(id).get();
		}
	
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		depotVenteRepository.deleteById(id);
	}
	
	
	
	@PutMapping("edit/{id}")
	public void update(@PathVariable int id, @RequestBody DepotVente depotVente)
	{
		depotVente.setDepot_id(id);
		depotVenteRepository.save(depotVente);
	}
	
	@GetMapping("/lastid/")
	public int lastid(){
		return depotVenteRepository.lastid();
	}
	
}
