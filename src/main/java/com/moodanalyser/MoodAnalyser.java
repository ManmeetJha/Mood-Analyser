package com.moodanalyser;

public class MoodAnalyser {

    public MoodAnalyser(Object o) {
    }

    public String analyseMood(String message) {
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch(NullPointerException e){
                return "HAPPY";
        }
    }
}


