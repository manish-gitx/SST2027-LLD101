public class taxcalculator{
    private double rate = 0.18;
    public double calculate(double amount) {
        return amount + amount * rate;
    }
}
