package com.kauabiscotto.HospitalSystem;

import java.time.LocalDate;

public class Consultation {

    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private String diagnosis;

    public Consultation(Patient patient, Doctor doctor, LocalDate date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void registrarDiagnostico(String diagnosis) {
        this.diagnosis = diagnosis;
        doctor.registrarDiagnostico(patient, diagnosis);
    }

    public void exibirInfo() {
        System.out.println("Consultation:");
        System.out.println("Patient: " + patient.getName());
        System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getEspeciality() + " )");
        System.out.println("Date: " + date);
        if (diagnosis != null) {
            System.out.println("Diagnosis: " + diagnosis);
        } else {
            System.out.println("Diagnosis not yet recorded.");
        }
    }
}
