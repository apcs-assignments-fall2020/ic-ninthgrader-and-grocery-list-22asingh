public class GroceryList {
    //instance variables
    private String[] arr;

    //constructor
    public GroceryList(){
        this.arr = new String[10];
    }

    //add
    public void add(String item){
        for (int i = 0; i < this.arr.length - 1; i ++){
            if (this.arr[i] == null){
                this.arr[i] = item;
                break;
            }
        }
    }

    //remove
    public void remove(String item){
        for (int i = 0; i < this.arr.length - 1; i ++){
            if (this.arr[i].equals(item)){
                this.arr[i] = null;
                for (int x = i; x < this.arr.length - 1; x ++){
                    this.arr[x] = this.arr[x+1];
                }
                break;
            }
        }
    }

    //toString
    public String toString(){
        String str = "Grocery List: ";
        for (int i = 0; i < this.arr.length - 1; i ++){
            if (this.arr[i] == null){
                break;
            }
            if (this.arr[i + 1] == null){
                str += this.arr[i];
            }
            else{
                str += this.arr[i] + ", ";
            } 
        }
        return str;
    }
}