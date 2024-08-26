package com.evergent.corejava.strings.immutable;

import java.security.PublicKey;

public final class PersonImmutable {

	private final String name;
	private final int age;
	public PersonImmutable(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public String myName() {
		return name;
	}
	public int myAge() {
		return age;
	}
	
	

}
