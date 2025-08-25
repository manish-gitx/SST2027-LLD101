public class Demo07{
    public static void main(String[] args){
        Printable basic=new BasicPrinter();
        basic.print("Hello");
        AllInOnePrinter allinone=new AllInOnePrinter();
        allinone.print("Document");
        allinone.scan("/tmp/out");
        allinone.fax("999-999-9999");
        PrintScanner scanner=new PrintScanner();
        scanner.print("Report");
        scanner.scan("/documents/");
    }
}
