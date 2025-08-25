public class Square implements Shape{
    private int side;
    
    public Square(){
        this.side=0;
    }
    
    public int area(){
        return side*side;
    }
    
    public void resize(int width, int height){
        if(width!=height){
            throw new IllegalArgumentException("Square must have equal width and height");
        }
        this.side=width;
    }
}
