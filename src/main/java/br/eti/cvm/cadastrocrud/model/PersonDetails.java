package br.eti.cvm.cadastrocrud.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.Digits;

import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
public class PersonDetails {
	@Digits(fraction = 0, integer = 3)
	private Integer age;
	
	private String address;
	
	private String city;
	
	private String zipCode;
	
	private String info;
	
	private String telephone;
}