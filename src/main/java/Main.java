import java.lang.reflect.Type;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coin usd = CoinFactory.getCoineType(Coins.USD);
        double result = usd.calculate(10);
        System.out.println("the amount is " + result);


    }
}
