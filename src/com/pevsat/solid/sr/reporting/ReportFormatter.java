package com.pevsat.solid.sr.reporting;

/**
 * Created by pevsat on 25.08.2017.
 */
public class ReportFormatter {

   private String formatedOutput;

    public ReportFormatter (Object object, TypeFormat formatType){
        switch (formatType){
            case XML: formatedOutput = convertObjectToXml(object);
                break;
            case CSV: formatedOutput = convertObjectToCsv(object);
                break;
        }
    }

    private String convertObjectToXml(Object object){
        return "XML: <title>" + object + "</title>";
    }

    private String convertObjectToCsv(Object object){
        return "Csv : ,,,, " + object.toString() + " ,,,,";
    }

    public String getFormatedOutput(){
        return formatedOutput;
    }
}
