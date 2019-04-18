package com.sparta.vk;

import com.sparta.vk.helpers.RatesFileReader;
import com.sparta.vk.helpers.RatesJsonParser;
import org.junit.Test;

public class JSONParseTest {

    @Test
    public void JSONParseCheck(){
        //This is to be deleted and used for validation
        RatesJsonParser ratesJsonParser = new RatesJsonParser("resources/rates.json");
        ratesJsonParser.printParsedFile();
    }
}
