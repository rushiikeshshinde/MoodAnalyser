package org.example;

public class MoodAnalyser {

    public String analyseMood(String message){

        message = message.toUpperCase();
        if(message.contains("SAD")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program!");

        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String message = "I am feeling Sad Today";
        System.out.println("The mood is "+moodAnalyser.analyseMood(message));

    }
}