public interface ShippingStrategy{
    double calculatecost(double weight);
    boolean canhandle(String type);
}
