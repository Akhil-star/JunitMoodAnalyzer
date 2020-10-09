package com.cg.junit.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenNullMood_Should_returnexception() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer( null );
        try {
            Assert.assertEquals( moodAnalyzer.analyseMood(), "HAPPY" );
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmptyMood_Should_returnexception() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer( " " );
        try {
            Assert.assertEquals( moodAnalyzer.analyseMood(), "HAPPY" );
        } catch (MoodAnalyzerException e){
            e.printStackTrace();
        }
    }
}