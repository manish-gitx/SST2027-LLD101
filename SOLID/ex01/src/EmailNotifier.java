public class EmailNotifier implements Notifier{
    public void send(String to, String message) {
        System.out.println("[EMAIL to=" + to + "] " + message);
    }
}
