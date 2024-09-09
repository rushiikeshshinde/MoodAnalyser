package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    void whenInSadMoodShouldReturnSad(){

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = moodAnalyser.analyseMood("I am in Sad Mood");
        assertEquals("SAD", message);

    }

    @Test
    void whenInAnyMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String message = moodAnalyser.analyseMood("I am in Any Mood");
        assertEquals("HAPPY", message);
    }


}