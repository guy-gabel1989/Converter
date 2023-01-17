package CoinsActions;

public class ILS extends Coin{
    private final double value = 0.28;
    @Override
    double getValue() {
        return value;
    }

    @Override
    public double calculate(double a) {
        return a * getValue();
    }
}
