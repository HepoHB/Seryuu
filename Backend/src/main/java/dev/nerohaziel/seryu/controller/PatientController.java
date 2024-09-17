package dev.nerohaziel.seryu.controller;

import dev.nerohaziel.seryu.model.Patient;
import dev.nerohaziel.seryu.model.PatientInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;

@Controller
public class PatientController{

    @RequestMapping("patient")
    @ResponseBody
    public Patient getPatient(){
        Patient patient = new Patient("Jean", LocalDate.of(2001, 3, 14),"Feminino", (double) 64.2,(double) 168);

        patient.setAlcoholConsumption(true);
        patient.setSexLife(true);
        patient.setSmoking(true);
        patient.addCchronicDiseases("Depressão");
        patient.addCchronicDiseases("Workaholismo");
        patient.addSurgeries("Retirada de Apêndice");
        patient.addContinuousMeds("Antidepressivo: Diazepam");
        patient.addContinuousMeds("Antidepressivo: Exodus");
        patient.addContinuousMeds("Medicamento para Insônia: Flurazepam");
        patient.addSymptons("Tosse");
        patient.addSymptons("Febre Alta");
        patient.addSymptons("Cansaço Extremo");
        patient.addSymptons("Desmaios Ocasionais");
        //PatientManipulation.patients.get(4).setPatientInfo("Após a triagem foi constatado que seus sintomas são muito provavelmente provenientes do seu estilo de vida estressante e nada saudável.", (byte) 1, 1);
        //PatientManipulation.patients.get(4).setPatientInfo("Após a consulta médica, a paciente foi encaminhada para a sala de infusão para repôr seus nutrientes perdidos e juntamente tomar um calmante", (byte) 2, 1);


        return patient;

    }

}
