package org.voiculescu.creational.builder;

import lombok.Getter;

//A product in builder pattern
@Getter
public class UserWebDTO implements UserDTO {

	private final String name;
	
	private final String address;
	
	private final String age;

	public UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}

    @Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
	
	
}
