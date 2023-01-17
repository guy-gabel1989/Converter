package CoinsActions;

public class CoinFactory {
    public static Coin getCoineType(Coins coinType) {
        switch (coinType) {
            case ILS:
                return new ILS();

            case USD:
                return new USD();

        }
        return null;
    }
}