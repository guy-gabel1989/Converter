package ConverterActions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResultPrint {
    public void resultPrint() throws IOException {

        //file path for the file the holds all the calculations
        String filePath = "Result List.txt";
        //Thank you message
        System.out.println("Thank you for using the converter");
        System.out.println("Here are all the conversions you've made: ");
        //prints everything that's in the Result List.txt file
        String resultsPrint = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(resultsPrint);
    }

}
