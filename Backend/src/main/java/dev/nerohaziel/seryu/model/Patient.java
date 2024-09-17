package dev.nerohaziel.seryu.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@Entity
@Table(name = "patient_table")
public class Patient extends Individual{
    //Primary Keys//
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;
    //Basic Data//
    @Column(name = "birthday", nullable = false)
    private LocalDate birthday;
    @Column(name = "gender", nullable = false)
    private String gender;
    @Column(name = "weight", precision = 3, scale = 2)
    private Double weight;
    @Column(name = "weight", precision = 3, scale = 1)
    private Double height;
    //Lifestyle//
    @Column(name = "sex_life")
    private boolean sexLife;
    @Column(name = "alcohol_comsumption")
    private boolean alcoholConsumption;
    @Column(name = "smoking")
    private boolean smoking;
    @Column(name = "obesity")
    private boolean obesity;
    @Column(name = "pregnant")
    private boolean pregnant;
    //Data List//
    private List<String> symptons = new ArrayList<>();
    private List<String> surgeries = new ArrayList<>();
    private List<String> chronicDiseases = new ArrayList<>();
    private List<String> continuousMeds = new ArrayList<>();

    public void addSymptons(String sympton){ symptons.add(sympton); }
    public void addSurgeries(String surgery){ surgeries.add(surgery); }
    public void addCchronicDiseases(String disease){ chronicDiseases.add(disease); }
    public void addContinuousMeds(String meds){ continuousMeds.add(meds); }

    public Patient(String name, LocalDate birthday, String gender, Double weight, Double height){
        super(name);
        this.birthday = birthday;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.code = totalPacients;
        totalPacients++;

    }

}
