public class CoffeMaker {
    private boolean hasWorkToDo;


    public void setCoffeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffie(){
        if(hasWorkToDo){
            System.out.println("coffie is being done");
            hasWorkToDo=false;
        }
    }

}
