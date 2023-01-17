import ConverterActions.ResultPrint;
import ConverterActions.SayGoodbye;
import ConverterActions.TryAgainLoop;
import ConverterActions.WelcomeMessage;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //First Screen - Welcome message
        WelcomeMessage firstWelcome = new WelcomeMessage();
        firstWelcome.welcomeMessage();

        // the converter method is inside the ConverterActions.TryAgainLoop class, see the mechanism inside that class
        TryAgainLoop converterWithLoop = new TryAgainLoop();
        converterWithLoop.tryAgain();

        //print all the results from the "Result List.txt.txt file"
        ResultPrint resultPrint = new ResultPrint();
        resultPrint.resultPrint();

        // Goodbye greeting and exiting
        SayGoodbye bye = new SayGoodbye();
        bye.goodbye();

    }

}
