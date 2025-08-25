public class Demo10{
    public static void main(String[] args){
        Logger consolelog=new ConsoleLogger();
        ReportService consoleService=new ReportService(consolelog);
        consoleService.generate();
        
        Logger filelog=new FileLogger();
        ReportService fileService=new ReportService(filelog);
        fileService.generate();
    }
}
