public class AllInOnePrinter implements Printable, Scannable, Faxable{
    public void print(String text){
        System.out.println("Print: "+text);
    }    
    public void scan(String dstpath){
        System.out.println("Scan to: "+dstpath);
    }
    public void fax(String number){
        System.out.println("Fax to: "+number);
    }
}
