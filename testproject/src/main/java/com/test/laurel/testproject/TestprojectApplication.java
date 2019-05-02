package com.test.laurel.testproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class TestprojectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(TestprojectApplication.class, args);
	}

	@Value("${n}")
	int n;            //Set the value of n in properties file for PrimeS

	@Value("${e}")
	int e; 			  //Set the value of e in properties file for EvenOrOddS

	@Override
	public void run(String... args) throws Exception {
		PrimeS.main1(n);        //Calling the PrimeS Class with the parameter n, 1st task

		EvenOrOddS.main1(e);    //Calling the EvenorOddS Class with parameter n, 2nd task
	}
}
