public class ShippingCostCalculator{
    private java.util.List<ShippingStrategy> strategies;
    
    public ShippingCostCalculator(){
        strategies=new java.util.ArrayList<>();
        strategies.add(new StandardShipping());
        strategies.add(new ExpressShipping());
        strategies.add(new OvernightShipping());
    }
    
    double cost(Shipment s){
        for(ShippingStrategy strategy:strategies){
            if(strategy.canhandle(s.type)){
                return strategy.calculatecost(s.weightkg);
            }
        }
        throw new IllegalArgumentException("Unknown type: "+s.type);
    }
}
