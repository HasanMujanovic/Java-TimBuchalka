public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car has started!!!");
    }
    public void drive(){
        System.out.println("Car has started driving!!!");
    }
    protected void runEngine(){
        System.out.println("Car run his engine!!!");
    }

}
class GasPoweredCar extends Car{
    public GasPoweredCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas powered Car starts with an key!!");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Gas powered car drives on Gas... duh");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Gas powered engine run his Engine");
    }
}
class ElectricCar extends Car{
    public ElectricCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric car started his engine");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Electric car is driving on electricity");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Electric car run his engine");
    }
}
class HybridCar extends Car{
    public HybridCar(String description) {
        super(description);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Hybrid car started his engine");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Hybrid car is driving");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Hybrid car run his engine");
    }
}