public class GroceryList {
    //instance variables
    private String[] arr;

    //constructor
    public GroceryList(){
        this.arr = new String[10];
    }

    //add
    public void add(String item){
        for (int i = 0; i < 10; i ++){
            if (this.arr[i] == null){
                this.arr[i] = item;
                break;
            }
        }
    }
}