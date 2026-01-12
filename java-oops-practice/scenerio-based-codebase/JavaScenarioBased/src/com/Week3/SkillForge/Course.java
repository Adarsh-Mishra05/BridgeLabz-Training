package com.Week3.SkillForge;

public class Course implements ICertifiable {

    String title;
    Instructor instructor;
    double rating;
    String[] modules;

    private String[] reviews; // read-only from outside

    // Default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Intro", "Basics", "Final Project"};
    }

    // Custom modules (overloading)
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    // Encapsulation: protected rating logic
    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;   // operator usage
    }

    // Read-only reviews
    public String[] getReviews() {
        return reviews;
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.progress >= 100) {
            System.out.println("Certificate issued for course: " + title);
        } else {
            System.out.println("Course not completed yet");
        }
    }
}