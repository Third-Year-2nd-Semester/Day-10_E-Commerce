package vau.ac.lk.ict.model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Person {
    private String name;
	private int age;
	private String gender;
}