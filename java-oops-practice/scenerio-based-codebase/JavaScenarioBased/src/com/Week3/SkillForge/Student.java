package com.Week3.SkillForge;

public class Student extends User {
	int progress;   // % completed
    int marks;

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completed) {
        progress += completed;   // operator usage
    }

    public void grade(int score) {
        marks = score;
    }
}

class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse() {
        System.out.println(name + " uploaded a course");
    }

}
