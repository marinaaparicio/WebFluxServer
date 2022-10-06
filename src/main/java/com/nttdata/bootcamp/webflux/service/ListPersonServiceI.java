package com.nttdata.bootcamp.webflux.service;

import com.nttdata.bootcamp.webflux.dto.Person;

import reactor.core.publisher.Flux;

public interface ListPersonServiceI {
	
	public Flux<Person> personList1();
	
	public Flux<Person> personList2();
	
	public Flux<Person> personList3();
	
	public Flux<Person> personList4();

}
