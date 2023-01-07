public abstract class Coin implements ICalcualate{
    abstract double getValue();

    @Override
    public double calculate(double a) {
        return a * getValue();
    }

}
