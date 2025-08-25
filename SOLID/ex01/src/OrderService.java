public class OrderService{
    private TaxCalculator calculator;
    private Notifier notifier;
    private OrderStorage storage;
    
    public OrderService(TaxCalculator calculator, Notifier notifier, OrderStorage storage){
        this.calculator=calculator;
        this.notifier=notifier;
        this.storage=storage;
    }
    
    void checkout(String email, double amount){
        double tax=calculator.calculate(amount);
        double total=amount+tax;
        storage.save(email, total);
        notifier.send(email,"Order total: "+total);
    }
}
