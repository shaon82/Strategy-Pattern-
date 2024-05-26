public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new DecoyDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.performFly();
    }
}