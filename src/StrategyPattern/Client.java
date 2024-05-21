package StrategyPattern;

public class Client {
    // 무기(전략) , 군인(컨텍스트), 보급장교(클라이언트)
    // 클라이언트와 전략을 생성해 전략을 실행할 컨텍스트에 주입하는 패턴
    public static void main(String[] args) {

        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달해서 전투를 수행하게 한다.
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        // 검을 람보에게 전달해서 전투를 수행하게 한다.
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        // 활을 람보에게 전달해서 전투를 수행하게 한다.
        strategy = new StrategyBow();
        rambo.runContext(strategy);
    }
}
