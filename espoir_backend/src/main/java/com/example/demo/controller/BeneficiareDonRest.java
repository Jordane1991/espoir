package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.BeneficiareDon;
import com.example.demo.repository.BeneficiaireDonRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/beneficiaire")
public class BeneficiareDonRest {
	@Autowired
	BeneficiaireDonRepository beneficiaireDonRepository;
	
	@GetMapping("/")
	public List<BeneficiareDon> getAll() {
		
		return beneficiaireDonRepository.findAll();
	}
	
	@PostMapping("save")
	public void save(@RequestBody BeneficiareDon bf) throws Exception{
		beneficiaireDonRepository.save(bf);
	}
	
	@GetMapping("{id}")
	public BeneficiareDon finByid(@PathVariable int id)
		{
			return beneficiaireDonRepository.findById(id).get();
		}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		beneficiaireDonRepository.deleteById(id);
	}
	
	@PutMapping("edit/{id}")
	public void update(@PathVariable int id, @RequestBody BeneficiareDon bf)
	{
		bf.setBen_id(id);
		beneficiaireDonRepository.save(bf);
	}
	

}
