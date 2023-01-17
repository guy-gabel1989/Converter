package CoinsActions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculateAndSaveResult {


    public void calculateAndSaveResult() {

        //Set filePath for storing the result at the end of each iteration
        String filePath = "Result List.txt";

        //while loop to keep user in the program until  the conditions are met
        while (true) {

            // Ask user what they would like to convert CoinsActions.USD or CoinsActions.ILS
            // try block starts
            try {
                System.out.println("Please choose what you'd like to convert: \n1. USD to ILS\n2. ILS to USD");
                Scanner scan = new Scanner(System.in);
                int choice = scan.nextInt();

                // Option 1 - convert CoinsActions.USD to CoinsActions.ILS
                Path path = Paths.get(filePath);
                //if loop that send the user to calculate CoinsActions.USD to CoinsActions.ILS
                if (choice == 1) {
                    System.out.println("Please enter an amount to convert");
                    double amount = scan.nextDouble();

                    // if loop that make sure the user insert only positive numbers that are greater than 0
                    if (amount <= 0) {
                        System.out.println("Invalid amount. Please enter a positive number greater than 0.");
                        continue;

                    } else {
                        //Calculating CoinsActions.USD to CoinsActions.ILS. creating new CoinsActions.USD coin via the CoinsActions.CoinFactory class
                        Coin usdCoin = CoinFactory.getCoineType(Coins.USD);
                        double result = usdCoin.calculate(amount);

                        //prints the chosen amount and the result of the calculation.
                        System.out.println(amount + " USD is equal to " + result + " ILS.");

                        // creating ArrayList to store the results in the file that's in the filePath
                        ArrayList<String> results = new ArrayList<>();
                        results.add("You converted " + amount + " USD to " + result + " ILS");
                        Files.write(path, results, StandardOpenOption.APPEND);
                    }

                    break;
                    //if loop that send the user to calculate CoinsActions.ILS to CoinsActions.USD
                } else if (choice == 2) {
                    System.out.println("How much would you like to convert?");
                    double amount = scan.nextDouble();

                    Coin ilsCoin = CoinFactory.getCoineType(Coins.ILS);
                    double result = ilsCoin.calculate(amount);
                    // if loop that make sure the user insert only positive numbers that are greater than 0
                    if (amount <= 0) {
                        System.out.println("Invalid amount. Please enter a positive number greater than 0.");
                        continue;
                    } else {
                        //Calculating CoinsActions.ILS to CoinsActions.USD. creating new CoinsActions.ILS coin via the CoinsActions.CoinFactory class
                        System.out.println(amount + " ILS is equal to " + result + " USD.");

                        // creating ArrayList to store the results in the file that's in the filePath
                        ArrayList<String> results = new ArrayList<>();
                        results.add("You converted " + amount + " ILS to " + result + " USD");
                        Files.write(path, results, StandardOpenOption.APPEND);
                    }
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter either 1 or 2.");
                }


            } catch (InputMismatchException e) {
                System.out.println("Invalid data, please enter a number ");
                System.out.println("Let's try again");


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}