package Week1.HospitalQueue;

class Patient {
    String name;
    int criticality; 

    Patient(String name, int criticality) {
        this.name = name;
        this.criticality = criticality;
    }
}

public class Main {

    // Bubble Sort based on criticality (High → Low)
    static void sortByCriticality(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                // Compare adjacent patients
                if (patients[j].criticality < patients[j + 1].criticality) {

                    // Swap
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;
                }
            }
        }
    }

    static void display(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p.name + " - Criticality: " + p.criticality);
        }
    }

    public static void main(String[] args) {

        Patient[] patients = {
            new Patient("Ramesh", 4),
            new Patient("Anita", 9),
            new Patient("Suresh", 2),
            new Patient("Meena", 7)
        };

        System.out.println("Before Sorting:");
        display(patients);

        sortByCriticality(patients);

        System.out.println("\nAfter Sorting (High Criticality First):");
        display(patients);
    }
}

