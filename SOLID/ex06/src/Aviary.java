public class Aviary{
    public void release(Flyable bird){
        bird.fly();
        System.out.println("Released flying bird");
    }
    public void release(Bird bird){
        bird.makeSound();
        System.out.println("Released bird");
    }
}
