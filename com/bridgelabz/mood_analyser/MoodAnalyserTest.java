package com.bridgelabz.mood_analyser;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoodAnalyserTest {
    @Test
    public void givenSadMoodShopuldreturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in sad mood");
        assertEquals("Sad",result);
    }
    @Test
    public void givenAnyMoodShopuldreturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in any mood");
        assertEquals("Happy",result);
    }
    @Test
    public void givenHappyMoodShopuldreturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Happy mood");
        assertEquals("Happy",result);
    }

}