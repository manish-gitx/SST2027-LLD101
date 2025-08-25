public class AreaCalculator{
    public static int areaafterresize(Shape s, int width, int height){
        s.resize(width,height);
        return s.area();
    }
}
