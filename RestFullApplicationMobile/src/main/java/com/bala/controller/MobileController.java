package com.bala.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bala.model.Mobile;
import com.bala.repository.MobileRepo;

import ch.qos.logback.core.model.Model;

@RestController
public class MobileController {
@Autowired
public MobileRepo repo;

@PostMapping("/req")
public Mobile saveMobile(@RequestBody Mobile mob, Model m) {
	return repo.save(mob);
 }

@PutMapping("/update/{modelId}")
public Mobile updateMobile(@RequestBody Mobile mob,@PathVariable Integer modelId, Model m) 
{   Optional<Mobile> o=repo.findById(modelId);
	Mobile m1=o.get();
	m1.setCompany_Name(mob.getCompany_Name());
	return repo.save(m1);  //save for update record
}
@GetMapping("/get/{modelId}")
public Mobile getOne(@PathVariable Integer modelId ,Model m ) {
	return repo.findById(modelId).get();
}
@GetMapping("/getAll")
public List<Mobile> getAll() {
	return (List<Mobile>)repo.findAll();
}
@DeleteMapping("/delete/{modelId}")
public void deleteMobile(@PathVariable Integer modelId,Model m) {
	repo.deleteById(modelId);
}

}
