public class Demo03{
    public static void main(String[] args){
        shippingcostcalculator calculator = new shippingcostcalculator();
        shipment ship = new shipment("EXPRESS", 2.0);
        System.out.println(calculator.cost(ship));
    }
}
