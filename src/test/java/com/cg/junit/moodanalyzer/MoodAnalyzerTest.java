package com.cg.junit.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer=new MoodAnalyzer();
    @Test
    public void givenMood_Should_returnSad(){
        Assert.assertEquals(moodAnalyzer.analyseMood( "I am in Sad Mood" ),"SAD");
    }

   /* @Test
    public void givenMood_Should_returnHappy(){
        Assert.assertEquals(moodAnalyzer.analyseMood( "I am in any Mood" ),"HAPPY");
    }*/
}
