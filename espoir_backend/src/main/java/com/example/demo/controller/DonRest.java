package com.example.demo.controller;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Don;
import com.example.demo.model.User;
import com.example.demo.repository.DonRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("don")
public class DonRest {

	@Autowired
	public DonRepository donRepository;
	
	@GetMapping("/")
	public List<Don> getAll()
	{
		return donRepository.findAll();
	}
	
	@PostMapping("save")
	public void save(@RequestBody Don don)throws Exception
	{
		donRepository.save(don);
	}
	
    /*@GetMapping(path = "/photoDon/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getPhoto(@PathVariable("id") Long id) throws Exception
    {
        User p = userRepository.findById(id).get();
        return Files.readAllBytes(Paths.get(System.getProperty("user.home")+"/Desktop/photo/zprojet/zprojet/src/assets/img/" + p.getPhoto()));
    }*/

    @PostMapping("/UploadPhoto/{id}")
    public void uploadPhoto(MultipartFile file , @PathVariable int id) throws Exception
    {
    	Don p = donRepository.findById(id).get();
        p.setPhoto(id + ".jpg");
        Files.write(Paths.get(System.getProperty("user.home" )+ "/Desktop/espoir/espoir/src/assets/img/" + p.getPhoto()), file.getBytes());
        donRepository.save(p);
    }
	@GetMapping("{id}")
	public Don finByid(@PathVariable int id)
		{
			return donRepository.findById(id).get();
		}
	
	@DeleteMapping("delete/{id}")
	public void delete(@PathVariable int id)
	{
		donRepository.deleteById(id);
	}
	
	@PutMapping("edit/{id}")
	public void update(@PathVariable int id, @RequestBody Don don)
	{
		don.setDon_id(id);
		donRepository.save(don);
	}
	
	@GetMapping("/notAccepted/")
	public List<Don> findListNotAccepted(){
		return donRepository.findDonNotAcceptedYet();
	}
	@GetMapping("/Accepted/")
	public List<Don> findListAccepted(){
		return donRepository.findDonAccepted();
	}
	@GetMapping("/Refused/")
	public List<Don> findListRefused(){
		return donRepository.findDonRefuser();
	}
	@GetMapping("/nbrnotAccepted/")
	public int countNotAccepted(){
		return donRepository.countNotAccepted();
	}
	@GetMapping("/nbrAccepted/")
	public int countAccepted(){
		return donRepository.countAccepted();
	}
	@GetMapping("/lastid/")
	public int lastid(){
		return donRepository.lastid();
	}

	
}
