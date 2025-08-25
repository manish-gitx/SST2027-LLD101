public class TaxCalculator{
    private double rate = 0.18;
    public double calculate(double amount) {
        return amount + amount * rate;
    }
}
