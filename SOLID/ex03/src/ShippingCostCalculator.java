public class shippingcostcalculator{
    private java.util.List<shippingstrategy> strategies;
    
    public shippingcostcalculator(){
        strategies=new java.util.ArrayList<>();
        strategies.add(new standardshipping());
        strategies.add(new expressshipping());
        strategies.add(new overnightshipping());
    }
    
    double cost(shipment s){
        for(shippingstrategy strategy:strategies){
            if(strategy.canhandle(s.type)){
                return strategy.calculatecost(s.weightkg);
            }
        }
        throw new IllegalArgumentException("Unknown type: "+s.type);
    }
}
