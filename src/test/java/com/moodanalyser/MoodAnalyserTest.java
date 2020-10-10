package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {


    @Test
    public void givenMessage_whenSad_ShouldreturSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a Sad Message");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_whenNotSad_ShouldreturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Any Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullmood_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionrule=ExpectedException.none();
            exceptionrule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMoodAgain();
            Assert.assertEquals("HAPPY",mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenNullMoodShouldthrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        moodAnalyser.analyseMood();

    }

    @Test
    public void givenEmptyMoodShouldthrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        moodAnalyser.analyseMood();
    }
}

