
public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        System.out.println("---------------------------------------------");
        mallardDuck.display();
        mallardDuck.performQuack();
        System.out.println("---------------------------------------------");
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        System.out.println("---------------------------------------------");
        Duck readheadDuck = new RedheadDuck();
        readheadDuck.display();
        readheadDuck.performQuack();
    }
}