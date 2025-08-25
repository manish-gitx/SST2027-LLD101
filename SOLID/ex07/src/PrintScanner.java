public class PrintScanner implements Printable, Scannable{
    public void print(String text){
        System.out.println("Print: "+text);
    }
    
    public void scan(String dstpath){
        System.out.println("Scan to: "+dstpath);
    }
}
