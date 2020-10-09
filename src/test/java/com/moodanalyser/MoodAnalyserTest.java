package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {


    @Test
    public void givenMessage_whenSad_ShouldreturSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
        String mood = moodAnalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldreturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullmood_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood(null);
        Assert.assertEquals("HAPPY",mood);
    }
}

