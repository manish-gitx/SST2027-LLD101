public class Demo06{
    public static void main(String[] args){
        Aviary aviary=new Aviary();        
        FlyingBird sparrow=new FlyingBird("Sparrow");
        aviary.release((Flyable)sparrow);
        
        Penguin penguin=new Penguin();
        aviary.release((Bird)penguin);        
        penguin.swim();
    }
} 