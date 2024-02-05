public class Main {
        public static void main(String[] args) {
            Animal animal = new Animal("Generic animal", "Huge", 400);
            doAnimalStuff(animal,"slow");
            Dog dog = new Dog();
            doAnimalStuff(dog,"fast");
            Dog yorkie = new Dog("Yorkie", 15);
            doAnimalStuff(yorkie,"fast");
            Dog retriever = new Dog("Labrador retriever", 65,"Floppy",
                    "Swimmer");
            doAnimalStuff(retriever,"slow");
            Dog wolf = new Dog("Wolf",40);
            doAnimalStuff(wolf,"slow");

            Fish glodie = new Fish("Goldfish",0.35,2,3);
            doAnimalStuff(glodie,"fast");
        }
        public static void doAnimalStuff(Animal animal, String speed){
            animal.makeNoise();
            animal.move(speed);
            System.out.println(animal);
            System.out.println("_ _ _ _ _");
        }
    }


