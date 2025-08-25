public class PaymentService{
    private java.util.List<PaymentProcessor> processors;
    
    public PaymentService(){
        processors=new java.util.ArrayList<>();
        processors.add(new CardPayment());
        processors.add(new UpiPayment());
        processors.add(new WalletPayment());
    }
    
    String pay(Payment p){
        for(PaymentProcessor processor:processors){
            if(processor.canhandle(p.provider)){
                return processor.process(p.amount);
            }
        }
        throw new RuntimeException("No provider");
    }
}
