package com.nttdata.bootcamp.webflux.service;

import java.time.Duration;

import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.webflux.dto.Person;

import reactor.core.publisher.Flux;

@Service
public class ListPersonService implements ListPersonServiceI{

	@Override
	public Flux<Person> personList1() {
		Person person = new Person();
		person.setFirstName("Marina");
		person.setLastName("Aparicio");
		person.setAge(22);
		return Flux.just(person).delayElements(Duration.ofSeconds(1));
	}

	@Override
	public Flux<Person> personList2() {
		Person person = new Person();
		person.setFirstName("Antonia");
		person.setLastName("Olivares");
		person.setAge(60);
		return Flux.just(person).delayElements(Duration.ofSeconds(3));
	}

	@Override
	public Flux<Person> personList3() {
		Person person = new Person();
		person.setFirstName("Lopez");
		person.setLastName("Vega");
		person.setAge(36);
		return Flux.just(person).delayElements(Duration.ofSeconds(5));
	}

	@Override
	public Flux<Person> personList4() {
		Person person = new Person();
		person.setFirstName("Amparo");
		person.setLastName("Duque");
		person.setAge(57);
		return Flux.just(person).delayElements(Duration.ofSeconds(7));
	}

}
