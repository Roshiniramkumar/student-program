package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(path = "Student", collectionResourceRel = "Student")
public interface StudentRestRepository extends JpaRepository<Student,String>{

}
