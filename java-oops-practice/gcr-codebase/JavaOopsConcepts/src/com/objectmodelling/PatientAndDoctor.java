package com.objectmodelling;
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println("Dr. " + name + " consulting " + p.name);
    }
}

public class PatientAndDoctor {
    public static void main(String[] args) {
        Doctor d = new Doctor("ABC");
        Patient p = new Patient("Priyanshu");

        d.consult(p);
    }
}