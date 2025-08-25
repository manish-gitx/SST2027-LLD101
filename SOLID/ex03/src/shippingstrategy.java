public interface shippingstrategy{
    double calculatecost(double weight);
    boolean canhandle(String type);
}
