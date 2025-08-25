public class framecache implements cache{
    private frame last;
    public void store(frame f){
        last=f;
        System.out.println("Cached last frame? "+(last!=null));
    }
}
