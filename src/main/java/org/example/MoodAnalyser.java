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


        if(this.message == null){
            return "HAPPY";
        }

        else if(message.contains("Sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyser Program!");

        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser();

            String message = "I am feeling Sad Today".toUpperCase();
            System.out.println("The mood is "+moodAnalyser.analyseMood());


        }
        catch (Exception e) {
            System.out.println(e);
        }


    }
}