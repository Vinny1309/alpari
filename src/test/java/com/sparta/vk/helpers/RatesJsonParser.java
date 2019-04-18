package com.sparta.vk.helpers;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class RatesJsonParser {

    private JSONObject ratesJson;

    //Parsing the file into a JSONObject
    public RatesJsonParser(String fileLocation) {
        try{
            RatesFileReader ratesFileReader = new RatesFileReader(fileLocation);
            JSONParser parser = new JSONParser();
            ratesJson = (JSONObject) parser.parse(ratesFileReader.getRatesFile());
        } catch(Exception e){
            e.printStackTrace();
        }
    }

//    //Exercising the code above
//    public void printParsedFile(){
//        System.out.println(ratesJson.get("rates"));
//    }


}
