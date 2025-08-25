public class Demo03{
    public static void main(String[] args){
        ShippingCostCalculator calculator = new ShippingCostCalculator();
        Shipment ship = new Shipment("EXPRESS", 2.0);
        System.out.println(calculator.cost(ship));
    }
}
