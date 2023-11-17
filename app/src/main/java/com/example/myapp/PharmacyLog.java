package com.example.myapp;

public class PharmacyLog {
    private int doctor_id;
    private  int patient_id;
    private int RX_id;
    private int pharmacy_id;
    private String name;

    public PharmacyLog(int doctor_id, int patient_id, int RX_id, int pharmacy_id, String name) {
        this.doctor_id = doctor_id;
        this.patient_id = patient_id;
        this.RX_id = RX_id;
        this.pharmacy_id = pharmacy_id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PharmacyLog{" +
                "doctor_id=" + doctor_id +
                ", patient_id=" + patient_id +
                ", RX_id=" + RX_id +
                ", pharmacy_id=" + pharmacy_id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getRX_id() {
        return RX_id;
    }

    public void setRX_id(int RX_id) {
        this.RX_id = RX_id;
    }

    public int getPharmacy_id() {
        return pharmacy_id;
    }

    public void setPharmacy_id(int pharmacy_id) {
        this.pharmacy_id = pharmacy_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
