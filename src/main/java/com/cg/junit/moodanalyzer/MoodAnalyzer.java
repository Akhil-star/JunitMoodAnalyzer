package com.cg.junit.moodanalyzer;

import java.util.Scanner;

public class MoodAnalyzer {
    private static String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message=message;
    }


    public String analyseMood(){
        if(message.contains( "Sad" )){
            return "SAD";
        }else{
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Mood analyzer");

    }
}
