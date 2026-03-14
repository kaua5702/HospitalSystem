package com.kauabiscotto.HospitalSystem;

public class SurgeonDoctor extends Doctor {

    public SurgeonDoctor(String name, int CRM) {
        super(name, CRM, "Surgeon");
    }

    @Override
    public void registrarDiagnostico(Patient patient, String diagnosis) {
        patient.adicionarDiagnostico("Surgical Diagnosis: " + diagnosis);
    }

}
