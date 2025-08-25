public class Rectangle implements Shape{
    private int width;
    private int height;
    
    public Rectangle(){
        this.width=0;
        this.height=0;
    }
    
    public int area(){
        return width*height;
    }
    
    public void resize(int width, int height){
        this.width=width;
        this.height=height;
    }
}
