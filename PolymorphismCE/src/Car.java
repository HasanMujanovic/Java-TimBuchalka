public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }
//    String className = this.getClass().getSimpleName();
    public void startEngine() {
        System.out.println(" engine is starting");
    }
    public void accelerate(){
        System.out.println(" is accelerating");
    }
    public void brake(){
        System.out.println(" is braking");
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
//class Mitsubishi extends Car{
//    public Mitsubishi(int cylinders, String name) {
//        super(cylinders, name);
//    }
//
//    @Override
//    public void startEngine() {
//        super.startEngine();
//    }
//
//    @Override
//    public void accelerate() {
//        super.accelerate();
//    }
//
//    @Override
//    public void brake() {
//        super.brake();
//    }
//}
//class Holden extends Car{
//    public Holden(int cylinders, String name) {
//        super(cylinders, name);
//    }
//    @Override
//    public void startEngine() {
//        super.startEngine();
//    }
//
//    @Override
//    public void accelerate() {
//        super.accelerate();
//    }
//
//    @Override
//    public void brake() {
//        super.brake();
//    }
//}
//class Ford extends Car{
//    public Ford(int cylinders, String name) {
//        super(cylinders, name);
//    }
//    @Override
//    public void startEngine() {
//        super.startEngine();
//    }
//
//    @Override
//    public void accelerate() {
//        super.accelerate();
//    }
//
//    @Override
//    public void brake() {
//        super.brake();
//    }
//}