package com.example.JPA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConnectivityWithJpaApplication implements CommandLineRunner {

	
	@Autowired
	Repository Repo;
	public static void main(String[] args) {
		SpringApplication.run(ConnectivityWithJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Student> stud= Repo.findAll();
		stud.forEach(System.out::println);

}
}
