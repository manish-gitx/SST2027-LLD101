public class Bird{
    protected String name;
    public Bird(){
        this.name="Bird";
    }  
    public Bird(String name){
        this.name=name;
    }
    public void makeSound(){
        System.out.println(name+" makes a sound");
    }
}
