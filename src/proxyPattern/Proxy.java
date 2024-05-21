package proxyPattern;

public class Proxy implements InterfaceService {

    InterfaceService iservice;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달");

        iservice = new Service();
        return iservice.runSomething();
    }
}
