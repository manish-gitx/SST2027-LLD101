public class Demo08{
    public static void main(String[] args){
        PedalPowered bike=new Bicycle();
        bike.pedal(10);        
        Car car=new Car();
        car.startengine();
        car.recharge(50);
    }
}
