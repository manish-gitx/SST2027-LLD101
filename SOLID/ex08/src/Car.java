public class Car implements EnginePowered, Rechargeable{
    public void startengine(){
        System.out.println("Engine started");
    }
    public void recharge(int kwh){
        System.out.println("Recharged "+kwh+" kWh");
    }
}
