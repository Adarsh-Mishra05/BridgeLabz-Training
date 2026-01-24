package Week3.AVLTree.Hospitalqueue;

public class PatientNode {
    int arrivalTime; // minutes from midnight
    String patientName;
    int height;

    PatientNode left, right;

    public PatientNode(String patientName, int arrivalTime) {
        this.patientName = patientName;
        this.arrivalTime = arrivalTime;
        this.height = 1;
    }
}
