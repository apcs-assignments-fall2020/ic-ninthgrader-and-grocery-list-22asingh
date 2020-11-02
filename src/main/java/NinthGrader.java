public class NinthGrader extends Student{
    //constructors
    public NinthGrader(String a, String b){
        super(a,b,2024);
    }

    public NinthGrader(){
        super("Samar","Dhoat",2024);
    }

    //doSomething
    @Override
    public void doSomething(){
        System.out.println("I am doing homework.");
    }

    //toString
    @Override
    public String toString(){
        return this.getFirstName() + this.getLastName() + ", " + this.getClassYear() + " (9th Grade)";
    }


}