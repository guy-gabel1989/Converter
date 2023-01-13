import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomeCoinAmount {


    void welcomecoinamount() {

        //while loop to keep user in the program until  the conditions are met
        String filePath = "Result List";
        while (true) {

            // Ask user what they would like to convert
            // try block starts
            try {
                System.out.println("Please choose an option: \n1. USD to ILS\n2. ILS to USD");
                Scanner scan = new Scanner(System.in);
                int choice = scan.nextInt();
                // Option 1 - convert USD to ILS
                if (choice == 1) {
                    System.out.println("Please enter an amount to convert");
                    double amount = scan.nextDouble();
                    Coin usdCoin = CoinFactory.getCoineType(Coins.USD);
                    double result = usdCoin.calculate(amount);
                    System.out.println(amount + " USD is equal to " + result + " ILS.");
                    ArrayList<String> results = new ArrayList<>();
                    results.add("You converted " +  amount + " USD to " + result + " ILS" );
                    Files.write(Paths.get(filePath), results, StandardOpenOption.APPEND);

                    break;
                } else if (choice == 2) {
                    System.out.println("How much would you like to convert?");
                    double amount = scan.nextDouble();
                    Coin ilsCoin = CoinFactory.getCoineType(Coins.ILS);
                    double result = ilsCoin.calculate(amount);
                    System.out.println(amount + " ILS is equal to " + result + " USD.");
                    ArrayList<String> results = new ArrayList<>();
                    results.add("You converted " +  amount + " ILS to " + result + " USD" );
                    Files.write(Paths.get(filePath), results, StandardOpenOption.APPEND);
                    //Files.writeString(Paths.get(filePath), "You converted " +  amount + "ILS to " + result + " USD" );
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