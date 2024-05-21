package proxyPattern;

public class ClientWithNoProxy {
    public static void main(String[] args) {
        // No proxy
        Service service = new Service();
        System.out.println(service.runSomething());
    }
}
