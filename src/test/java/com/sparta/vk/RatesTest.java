package com.sparta.vk;

import com.sparta.vk.helpers.RatesFileReader;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class RatesTest {

    private static String testFile;

    @BeforeClass
    public static void createFile(){
        File temp = null;
        try {
            temp = File.createTempFile("Temp", ".txt", new File("resources/"));
            testFile = temp.getName();
        } catch (IOException e) {
            e.printStackTrace();
        }
        temp.deleteOnExit();
    }

    @Test
    public void testFileReader(){
        new RatesFileReader("resources/" + testFile);
    }

}
