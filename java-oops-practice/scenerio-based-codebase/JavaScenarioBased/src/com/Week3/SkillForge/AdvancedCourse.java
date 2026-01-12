package com.Week3.SkillForge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.progress >= 100 && student.marks >= 70) {
            System.out.println("Advanced Certificate with Grade A issued");
        } else {
            System.out.println("Advanced course requirements not met");
        }
    }
}