import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //First Screen - Welcome message
        WelcomeMessage firstWelcome = new WelcomeMessage();
        firstWelcome.welcomeMessage();

        TryAgainLoop converterWithLoop = new TryAgainLoop();
        converterWithLoop.tryAgain();

        ResultPrint resultPrint = new ResultPrint();
        resultPrint.resultPrint();
    }

}
