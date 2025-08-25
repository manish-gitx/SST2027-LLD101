public class player{
    private decoder decoder;
    private ui ui;
    private cache cache;
    
    public player(decoder decoder, ui ui, cache cache){
        this.decoder=decoder;
        this.ui=ui;
        this.cache=cache;
    }
    
    void play(byte[] filebytes){
        frame f=decoder.decode(filebytes);
        cache.store(f);
        ui.display(filebytes.length);
    }
}
