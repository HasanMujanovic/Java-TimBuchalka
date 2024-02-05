public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal", "Huge", 400);
        doAnimalStuff(animal,"slow");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
public class Animal {
    private String type;
    private String  size;
    private double weight;

    public Animal(){}
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed){
        System.out.println(type + "moves "+ speed);
    }
    public void makeNoise(){
        System.out.println(type + " make some kind of noise");
    }
}
public class Dog extends Animal{
    public Dog(){
        super();
    }
}
