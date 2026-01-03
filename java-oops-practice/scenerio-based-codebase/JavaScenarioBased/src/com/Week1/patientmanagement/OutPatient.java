package com.Week1.patientmanagement;

public class OutPatient extends Patient {

    private String visitDate;

    public OutPatient(int patientId, String name, int age,
                      String history, String visitDate) {
        super(patientId, name, age, history);
        this.visitDate = visitDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(getSummary() +
                ", Visit Date: " + visitDate);
    }
}
