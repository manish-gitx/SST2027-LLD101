public class Demo1{
    public static void main(String[] args) {
        TaxCalculator calc = new TaxCalculator();
        Notifier email = new EmailNotifier();
        OrderStorage store = new OrderStorage();
        
        OrderService service = new OrderService(calc, email, store);
        service.checkout("tommy@shop.com", 100.0);
    }
}