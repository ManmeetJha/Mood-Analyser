package com.moodanalyser;

public class MoodAnalyser {


    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
    }

    String message;
    public String analyseMood()  {
        try {
            return analyseMoodAgain();
        } catch (MoodAnalysisException e) {
            return "HAPPY";
        }
    }

    public String analyseMoodAgain() throws MoodAnalysisException {
        try {
            if(message.length()==0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,"Please enter valid mood");
            else if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter valid mood");
        }
    }
}


