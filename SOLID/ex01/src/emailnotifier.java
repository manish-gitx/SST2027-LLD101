public class emailnotifier implements notifier{
    public void send(String to, String message) {
        System.out.println("[EMAIL to=" + to + "] " + message);
    }
}
