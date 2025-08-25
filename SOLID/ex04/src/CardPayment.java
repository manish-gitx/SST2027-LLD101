public class CardPayment implements PaymentProcessor{
    public String process(double amount){
        return "Charged card: "+amount;
    }
    public boolean canhandle(String provider){
        return "CARD".equals(provider);
    }
}
