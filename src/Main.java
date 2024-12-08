public class Main {
    public static void main(String []args){
        SmartKitchen kitchen = new SmartKitchen();
//        kitchen.getDishWasher().setDishWasher(true);
//        kitchen.getBrewMaster().setCoffeMaker(true);
//        kitchen.getIceBox().setRefrigerator(true);
//        kitchen.getDishWasher().doDishes();
//        kitchen.getBrewMaster().brewCoffie();
//        kitchen.getIceBox().orderFood();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKithchenWork();

    }
}
