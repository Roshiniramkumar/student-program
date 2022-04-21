package com.example.demo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Student {
@Id
@GeneratedValue

String name;
String section;
String classstudying;
public Student() {
	super();
}
}
