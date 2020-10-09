package com.cg.junit.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
    private static String message;
    enum ERROR{
        EMPTY,NULL
    }
    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message=message;
    }


    public String analyseMood() throws MoodAnalyzerException {

        if (message.contains( "Sad" ))
            return "SAD";
        else if(message.contains( " " ))
            throw new MoodAnalyzerException( " Empty moood !! Enter valid mood"  );
        else if (message.contains( null ))
            throw new MoodAnalyzerException( "Null mood!! Enter valid mood" ) ;
        else
            return "HAPPY";
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood analyzer");

    }
}
