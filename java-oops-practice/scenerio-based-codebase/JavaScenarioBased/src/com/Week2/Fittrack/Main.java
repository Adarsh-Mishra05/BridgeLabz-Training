package com.Week2.Fittrack;

public static void main(String[] args) {

    UserProfile user = new UserProfile("Priyanshu", 22, 70, "Lose Weight");
    user.displayProfile();

    int dailyTarget = 500;

    Workout cardio = new CardioWorkout(30);
    ITrackable track1 = (ITrackable) cardio;

    track1.startWorkout();
    track1.stopWorkout();

    double progress = dailyTarget - cardio.calculateCalories();
    System.out.println("Remaining calories to burn today: " + progress);

    System.out.println("*************");

    Workout strength = new StrengthWorkout(40);
    ITrackable track2 = (ITrackable) strength;

    track2.startWorkout();
    track2.stopWorkout();
}