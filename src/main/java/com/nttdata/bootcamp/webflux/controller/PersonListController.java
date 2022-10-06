package com.nttdata.bootcamp.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.webflux.dto.Person;
import com.nttdata.bootcamp.webflux.service.ListPersonServiceI;

import reactor.core.publisher.Flux;

@RestController
public class PersonListController {
	
	
	@Autowired
	ListPersonServiceI listPersonServiceI;
	
	@GetMapping("/person-list-1")
	public Flux<Person> personList1(){
		return listPersonServiceI.personList1();
		
	}
	
	@GetMapping("/person-list-2")
	public Flux<Person> personList2(){
		return listPersonServiceI.personList2();
		
	}
	
	@GetMapping("/person-list-3")
	public Flux<Person> personList3(){
		return listPersonServiceI.personList3();
		
	}
	
	@GetMapping("/person-list-4")
	public Flux<Person> personList4(){
		return listPersonServiceI.personList4();
		
	}

	

}
