public interface PaymentProcessor{
    String process(double amount);
    boolean canhandle(String provider);
}
