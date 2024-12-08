public class SmartKitchen {
    CoffeMaker brewMaster;
    DishWasher dishWasher;
    Refrigerator IceBox;


    public SmartKitchen() {
        brewMaster = new CoffeMaker();
        IceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }


    public void pourmilk(){
        brewMaster.brewCoffie();
    }

    public void loadDishWasher(){
        dishWasher.doDishes();
    }

    public void addWater(){
            IceBox.orderFood();
    }


    public void setKitchenState(boolean brew,boolean dish,boolean ice){
        brewMaster.setCoffeMaker(brew);
        dishWasher.setDishWasher(dish);
        IceBox.setRefrigerator(ice);
    }
    public void doKithchenWork(){
        pourmilk();
        loadDishWasher();
        addWater();
    }

    public CoffeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return IceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }
}
