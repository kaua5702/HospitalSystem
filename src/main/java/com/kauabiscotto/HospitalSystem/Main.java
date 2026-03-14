package com.kauabiscotto.HospitalSystem;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Patient registration
        System.out.println("=== Patient Registration ===");
        System.out.print("Enter patient name: ");
        String patientName = sc.nextLine();
        System.out.print("Enter patient age: ");
        int patientAge = sc.nextInt();
        sc.nextLine(); // consume newline

        Patient patient = new Patient(patientName, patientAge);

        // Doctor registration
        System.out.println("\n=== Doctor Registration ===");
        System.out.print("Enter doctor name: ");
        String doctorName = sc.nextLine();
        System.out.print("Enter doctor CRM: ");
        int doctorCRM = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Choose specialty (1 - Clinical, 2 - Surgeon): ");
        int doctorType = sc.nextInt();
        sc.nextLine();

        Doctor doctor;
        if (doctorType == 1) {
            doctor = new ClinicalDoctor(doctorName, doctorCRM);
        } else {
            doctor = new SurgeonDoctor(doctorName, doctorCRM);
        }

        // Consultation scheduling
        System.out.println("\n=== Consultation Scheduling ===");
        LocalDate consultationDate = LocalDate.now(); // current date
        Consultation consultation = new Consultation(patient, doctor, consultationDate);

        // Diagnosis registration
        System.out.print("Enter diagnosis: ");
        String diagnosis = sc.nextLine();
        consultation.registrarDiagnostico(diagnosis);

        // Display information
        System.out.println("\n=== Consultation Information ===");
        consultation.exibirInfo();

        System.out.println("\n=== Patient Medical History ===");
        patient.exibirHistorico();

        sc.close();
    }
}