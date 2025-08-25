public class overnightshipping implements shippingstrategy{
    public double calculatecost(double weight){
        return 120+10*weight;
    }
    public boolean canhandle(String type){
        return "OVERNIGHT".equals(type);
    }
}
