package com.example.Springboot_CRUD_Dynamic_insert_update;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassangerController 
{
@Autowired
PassangerRepository prepo;
@RequestMapping("/test")
public String test()
{
	return"test is completed";
}
@RequestMapping("/save")
public String saveData(@RequestBody Passanger p)
{
	prepo.save(p);
	return"data is saved into database";
}
@GetMapping("/all")
public List<Passanger> allData()
{
	return prepo.findAll();
}
@PutMapping("/update/{id}")
public String PutUpdate (@RequestBody Passanger p,@PathVariable int id)
{
	Passanger pa=prepo.findById(id).get();
	pa.setName(p.getName());
	pa.setAge(p.getAge());
	pa.setCity(p.getCity());
	pa.setSno(p.getSno());
	prepo.save(pa);
	return"data is updated";
}
@PatchMapping("/patch/{id}")
public String patchupdate (@RequestBody Passanger p,@PathVariable int id)
{
	Passanger pa=prepo.findById(id).get();
	pa.setName(p.getName());
	pa.setAge(p.getAge());
	pa.setSno(p.getSno());
	return"name,age and sno fields are updated by using patch Method";
}
@DeleteMapping("/del/{id}")
public String delete(@PathVariable int id)
{
	prepo.deleteById(id);
	return"data is deleted";
}
}
