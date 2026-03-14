package com.kauabiscotto.HospitalSystem;

public class ClinicalDoctor extends Doctor {

    public ClinicalDoctor(String name, int CRM) {
        super(name, CRM, "General Practitioner");
    }

    @Override
    public void registrarDiagnostico(Patient patient, String diagnosis) {
        patient.adicionarDiagnostico("Clinical Diagnosis: " + diagnosis);
    }
}
