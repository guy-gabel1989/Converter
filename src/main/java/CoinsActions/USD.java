package CoinsActions;

public class USD extends Coin{
    private final double value = 3.52;
    @Override
    double getValue() {
        return value;
    }

    @Override
    public double calculate(double a) {
        return a * getValue();
    }
}
