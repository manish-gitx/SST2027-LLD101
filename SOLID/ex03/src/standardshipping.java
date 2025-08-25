public class standardshipping implements shippingstrategy{
    public double calculatecost(double weight){
        return 50+5*weight;
    }
    public boolean canhandle(String type){
        return "STANDARD".equals(type);
    }
}
