package com.cg.junit.moodanalyzer;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

    @Test
    public void givenMood_Should_returnSad(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in Sad mood");
        Assert.assertEquals(moodAnalyzer.analyseMood(),"SAD");
    }

    @Test
    public void givenMood_Should_returnHappy(){
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in any mood");
        Assert.assertEquals(moodAnalyzer.analyseMood(),"HAPPY");
    }
}
