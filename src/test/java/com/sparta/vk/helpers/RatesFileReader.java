package com.sparta.vk.helpers;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class RatesFileReader {

    private FileReader ratesFile;

    public RatesFileReader(String fileLocation) {
        try {
            ratesFile = new FileReader(fileLocation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public FileReader getRatesFile() {
        return ratesFile;
    }
}
