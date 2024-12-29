package org.voiculescu.creational.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

//Class used to construct the product
@Setter
@Getter
public class User {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private Address address;

}
