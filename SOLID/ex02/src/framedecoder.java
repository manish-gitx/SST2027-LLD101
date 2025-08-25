public class framedecoder implements decoder{
    public frame decode(byte[] data){
        return new frame(data);
    }
}
