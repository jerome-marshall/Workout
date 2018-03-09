package com.example.jerry.workout;


public class Workout {
    private String name;
    private String description;

    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public static final Workout[] workouts = {
            new Workout("The Limb loosener", "5 Hand Pushups\n10 1-legged Squats\n15 Pull-ups"),
            new Workout("Core Agony", "100 Pull-ups\n100 Push-ups\n100 Squats"),
            new Workout("The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("S", "500 meter run\n21 x 1.5 pood kettleball\n21 x Pull-ups")
    };

    public String getName(){
        return name;
    }

    public  String getDescription(){
        return description;
    }

    public String toString(){
        return this.name;
    }
}
