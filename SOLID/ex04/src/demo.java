public class demo{
    public static void main(String[] args){
        PaymentService service=new PaymentService();
        System.out.println(service.pay(new Payment("CARD",100.0)));
        System.out.println(service.pay(new Payment("UPI",50.0)));
        System.out.println(service.pay(new Payment("WALLET",25.0)));
    }
}
