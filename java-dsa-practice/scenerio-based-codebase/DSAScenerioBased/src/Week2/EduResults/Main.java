package Week2.EduResults;

public class Main {
	public static void main(String[] args) {

        Student[] students = {
            new Student(95, "Amit"),
            new Student(88, "Riya"),
            new Student(95, "Suman"),
            new Student(72, "Karan"),
            new Student(88, "Neha")
        };

        System.out.println("Before Sorting:");
        EduResults.display(students);

        EduResults.mergeSort(students, 0, students.length - 1);

        System.out.println("\nFinal State-wise Rank List:");
        EduResults.display(students);
    }

}
