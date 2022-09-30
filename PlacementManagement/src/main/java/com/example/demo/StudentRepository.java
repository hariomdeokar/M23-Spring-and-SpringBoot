package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

//JPARepository is exists in Spring data dependencies and it contain all the CURD operation of Spring JPA
public interface StudentRepository extends JpaRepository<Student,Integer>
{
	

}
