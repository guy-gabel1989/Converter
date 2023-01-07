public class CoinFactory {
    public static Coin getCoineType(Coins coinType) {
        switch (coinType) {
            case ILS ->
                new ILS();
        }
        switch (coinType) {
            case USD ->
                new USD();
        }
        return null;
    }
}
