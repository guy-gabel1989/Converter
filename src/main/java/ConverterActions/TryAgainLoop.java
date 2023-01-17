package ConverterActions;

import CoinsActions.CalculateAndSaveResult;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAgainLoop {
    //wrapping the calculation in a loop to make sure the user stay in the program
    public void tryAgain(){
        //initializing startOver object
        String startOver = null;
        do {
            //calling the CoinsActions.CalculateAndSaveResult class to initiate the coin creation
            CalculateAndSaveResult start = new CalculateAndSaveResult();
            start.calculateAndSaveResult();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("That's it!");
            //ask the user if he is done; Y will start over, N end the method and the program will continue in the main class
            System.out.println("Do you want to start over?  \n Y - yes, let's start over \n N - no that's it");
            do{
                try {
                    //try-catch block to make sure the program doesn't crash or exits early
                    startOver = scanner2.next();
                    if (!startOver.equalsIgnoreCase("Y") && !startOver.equalsIgnoreCase("N")) {
                        System.out.println("Invalid input, Please type Y or N");
                    }
                    else break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input, Please type Y or N");
                    scanner2.next();
                }
            }while (true);
        }
        while (startOver.equalsIgnoreCase("Y"));
    }
}
