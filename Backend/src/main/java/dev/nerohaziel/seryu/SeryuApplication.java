package dev.nerohaziel.seryu;

import dev.nerohaziel.seryu.controller.PatientController;
import dev.nerohaziel.seryu.model.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class SeryuApplication{
	public static void main(String[] args){
		SpringApplication.run(SeryuApplication.class, args);
		PatientController patientController = new PatientController();
		patientController.getPatient();

	}

}
