public class SmartKitchen {
    private Refrigerator iceBox;
    private DishWasher dishWasher;
    private CoffeMaker brewMaster;

    public SmartKitchen() {
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
        brewMaster = new CoffeMaker();
    }


    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }
    public void setKitchenState(boolean iceBox, boolean dishWasher, boolean brewMaster){
    getDishWasher().setHasWorkToDo(dishWasher);
    getBrewMaster().setHasWorkToDo(brewMaster);
    getIceBox().setHasWorkToDo(iceBox);
    }
    public void doKitchenJob(){
        getIceBox().orderFood();
        getDishWasher().doDishes();
        getBrewMaster().brewCoffe();
    }
}
