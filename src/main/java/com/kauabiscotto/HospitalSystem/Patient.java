package com.kauabiscotto.HospitalSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Patient {

    private String name;
    private int age;
    private String idMedicalRecord;
    private List<String> historicMedical;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.idMedicalRecord = UUID.randomUUID().toString();
        historicMedical = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIdMedicalRecord() {
        return idMedicalRecord;
    }

    public List<String> getHistoricMedical() {
        return historicMedical;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHistoricMedical(List<String> historicMedical) {
        this.historicMedical = historicMedical;
    }

    public void exibirHistorico() {
        System.out.println("Patient " + getName() + " history: ");
        for (String diagnosis : historicMedical) {
            System.out.println("-" + diagnosis);
        }
    }

    public void adicionarDiagnostico(String diagnosis) {
        historicMedical.add(diagnosis);
    }
}
