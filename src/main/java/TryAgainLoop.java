import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAgainLoop {
    void tryAgain(){
        String startOver = null;
        do {
            CalculateAndSaveResult start = new CalculateAndSaveResult();
            start.calculateAndSaveResult();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("That's it!");
            System.out.println("Do you want to start over?  \n Y - yes, let's start over \n N - no that's it");
            do{
                try {
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
