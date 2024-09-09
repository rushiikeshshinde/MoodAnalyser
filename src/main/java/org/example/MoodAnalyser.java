package org.example;

public class MoodAnalyser {

    String message;

    public MoodAnalyser() {
        this.message = "";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }


    public String analyseMood(){

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
        System.out.println("The mood is "+moodAnalyser.analyseMood());

    }
}