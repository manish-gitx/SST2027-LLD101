public class demo02{
    public static void main(String[] args){
        decoder decoder=new framedecoder();
        ui ui=new consoleui();
        cache cache=new framecache();
        
        player p=new player(decoder,ui,cache);
        p.play(new byte[]{1,2,3,4});
    }
}
