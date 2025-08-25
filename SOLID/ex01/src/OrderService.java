public class orderservice{
    private taxcalculator calculator;
    private notifier notifier;
    private orderstorage storage;
    
    public orderservice(taxcalculator calculator, notifier notifier, orderstorage storage){
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
