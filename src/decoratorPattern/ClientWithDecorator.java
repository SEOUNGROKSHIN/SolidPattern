package decoratorPattern;

public class ClientWithDecorator {
    public static void main(String[] args) {

        // 반환값에 장식을 더한다는 것을 빼면 프록시 패턴과 동일

        IService decorator = new Decoreator();
        System.out.println(decorator.runSomething());
    }
}
