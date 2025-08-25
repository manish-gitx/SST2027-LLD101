public class FlyingBird extends Bird implements Flyable{
    public FlyingBird(){
        super("Flying Bird");
    }
    
    public FlyingBird(String name){
        super(name);
    }
    
    public void fly(){
        System.out.println(name+" flaps wings and flies!");
    }
}
