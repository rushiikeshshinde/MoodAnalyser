package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test
    void whenInSadMoodShouldReturnSad(){

        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String message = moodAnalyser.analyseMood();
        assertEquals("SAD", message);

    }

    @Test
    void whenInAnyMoodShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String message = moodAnalyser.analyseMood();
        assertEquals("HAPPY", message);
    }


}