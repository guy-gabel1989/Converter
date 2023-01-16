import java.util.Scanner;

public class TryAgainLoop {
    void tryAgain(){
        String startOver;
        do {

            WelcomeCoinAmount start = new WelcomeCoinAmount();
            start.welcomecoinamount();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("That's it!");
            System.out.println("Do you want to start over?  \n Y - yes, let's start over \n N - no that's it");
            startOver = scanner2.next();
            if (!startOver.equalsIgnoreCase("Y") && !startOver.equalsIgnoreCase("N")) {
                System.out.println("Invalid input, Please type Y or N");
                startOver = scanner2.next();
            }
        }
        while (startOver.equalsIgnoreCase("Y"));

    }

}
