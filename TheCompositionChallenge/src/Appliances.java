public class Appliances {
    private boolean hasWorkToDo;
    public Appliances(){
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }
}
 class Refrigerator extends Appliances{

    public void orderFood(){
        if (isHasWorkToDo()) {
            System.out.println("Food has been ordered");
        } else {
            System.out.println("Food isnt ordered");
        }
    }
}
class DishWasher extends Appliances{

    public void doDishes(){
        if (isHasWorkToDo()) {
            System.out.println("Doing dishes");
        } else {
            System.out.println("Not doing dishes");
        }
    }
}
class CoffeMaker extends Appliances{

    public void brewCoffe(){
        if (isHasWorkToDo()) {
            System.out.println("Making coffe");
        } else {
            System.out.println("Not making coffe");
        }    }
}


