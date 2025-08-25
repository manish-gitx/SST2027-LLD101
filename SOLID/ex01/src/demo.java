public class demo{
    public static void main(String[] args) {
        taxcalculator calc = new taxcalculator();
        notifier email = new emailnotifier();
        orderstorage store = new orderstorage();
        
        orderservice service = new orderservice(calc, email, store);
        service.checkout("tommy@shop.com", 100.0);
    }
}
