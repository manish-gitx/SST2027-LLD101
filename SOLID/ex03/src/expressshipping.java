public class expressshipping implements shippingstrategy{
    public double calculatecost(double weight){
        return 80+8*weight;
    }
    
    public boolean canhandle(String type){
        return "EXPRESS".equals(type);
    }
}
