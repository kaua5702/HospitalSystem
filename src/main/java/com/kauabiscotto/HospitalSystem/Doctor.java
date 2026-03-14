package com.kauabiscotto.HospitalSystem;

public abstract class Doctor {

    private String name;
    private int CRM;
    private String especiality;

    public Doctor(String name, int CRM, String especiality) {
        this.name = name;
        this.CRM = CRM;
        this.especiality = especiality;
    }

    public String getName() {
        return name;
    }

    public int getCRM() {
        return CRM;
    }

    public String getEspeciality() {
        return especiality;
    }

    public abstract void registrarDiagnostico(Patient patient, String diagnosis);

    public void exibirInfo() {
        System.out.println("Doctor's information:");
        System.out.println("Name: " + getName());
        System.out.println("CRM: " + getCRM());
        System.out.println("Especiality: " + getEspeciality());
    }
}
