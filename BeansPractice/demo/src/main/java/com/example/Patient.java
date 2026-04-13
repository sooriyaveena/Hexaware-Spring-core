package com.example;

public class Patient {

    private int patientId;
    private String patientName;
    private Doctor doctor;   // 🔥 relation

    public Patient() {
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {   
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Patient [patientId=" + patientId +
               ", patientName=" + patientName +
               ", doctor=" + doctor + "]";
    }
}