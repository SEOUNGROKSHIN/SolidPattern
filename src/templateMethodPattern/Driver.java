package templateMethodPattern;

public class Driver {
    public static void main(String[] args) {
        // 상위 클래스의 견본 메서드에서 하위 클래스가 오버라이딩한 메서드를 호출하는 패턴
       Animal bolt = new Dog();
       Animal kitty = new Cat();

       bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();
    }
}
