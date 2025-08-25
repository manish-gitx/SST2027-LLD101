public class Penguin extends Bird{
    public Penguin(){
        super("Penguin");
    }
    public void swim(){
        System.out.println(name+" swims gracefully");
    }
    public void makeSound(){
        System.out.println(name+" honks");
    }
}
