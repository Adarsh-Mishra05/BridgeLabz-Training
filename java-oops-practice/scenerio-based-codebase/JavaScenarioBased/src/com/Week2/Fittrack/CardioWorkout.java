package com.Week2.Fittrack;

public class CardioWorkout extends WorkOut implements ITrackable {

    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    @Override
    public double calculateCalories() {
        caloriesBurned = duration * 8.0; 
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        System.out.println("Cardio workout started...");
    }

    @Override
    public void stopWorkout() {
        calculateCalories();
        System.out.println("Cardio workout stopped.");
        logWorkout();
    }
}
