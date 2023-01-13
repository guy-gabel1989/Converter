import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        WelcomeMessage firstWelcome = new WelcomeMessage();
        firstWelcome.welcomeMessage();
        TryAgainLoop converterWithLoop = new TryAgainLoop();
        converterWithLoop.tryAgain();

        String filePath = "Result List";
        String resultsPrint = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(resultsPrint);
        


    }

}
