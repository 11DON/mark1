public class DishWasher {
    private boolean hasWorkToDo;


    public void setDishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes(){
        if(hasWorkToDo){
            System.out.println("dishes are being washed");
        }
    }


}
