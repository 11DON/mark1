public class Refrigerator {
    private boolean hasWorkToDo;


    public void setRefrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood(){
        if(hasWorkToDo){
            System.out.println("refrigerator is working");
            hasWorkToDo=false;
        }
    }


}
