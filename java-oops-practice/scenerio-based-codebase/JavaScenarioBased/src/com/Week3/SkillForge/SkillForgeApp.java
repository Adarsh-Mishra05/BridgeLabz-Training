package com.Week3.SkillForge;

public class SkillForgeApp {
	public static void main(String[] args) {

        Instructor inst = new Instructor("Adarsh", "adarsh@skillforge.com");
        Student stu = new Student("Rahul", "rahul@gmail.com");

        String[] modules = {"Java Basics", "OOPS", "Project"};
        Course course = new AdvancedCourse("Java Mastery", inst, modules);

        stu.updateProgress(100);
        stu.grade(85);

        course.generateCertificate(stu);
	}

}
