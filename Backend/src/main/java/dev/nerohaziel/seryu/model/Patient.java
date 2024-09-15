package dev.nerohaziel.seryu.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Entity{
    public static int totalPacients = 0;
    //Basic Data//
    @Getter @Setter
    private LocalDate birthday;
    @Getter @Setter
    private String gender;
    @Getter @Setter
    private float weight;
    @Getter @Setter
    private float height;
    //Lifestyle//
    @Getter @Setter
    private boolean sexLife;
    @Getter @Setter
    private boolean alcoholConsumption;
    @Getter @Setter
    private boolean smoking;
    @Getter @Setter
    private boolean obesity;
    @Getter @Setter
    private boolean pregnant;
    //Data List//
    @Getter
    private List<String> symptons = new ArrayList<>();
    @Getter
    private List<String> surgeries = new ArrayList<>();
    @Getter
    private List<String> chronicDiseases = new ArrayList<>();
    @Getter
    private List<String> continuousMeds = new ArrayList<>();

    public void addSymptons(String sympton){ symptons.add(sympton); }
    public void addSurgeries(String surgery){ surgeries.add(surgery); }
    public void addCchronicDiseases(String disease){ chronicDiseases.add(disease); }
    public void addContinuousMeds(String meds){ continuousMeds.add(meds); }

    public Patient(String name, LocalDate birthday, String gender, float weight, float height){
        super(name);
        this.birthday = birthday;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.code = totalPacients++;

    }

}
