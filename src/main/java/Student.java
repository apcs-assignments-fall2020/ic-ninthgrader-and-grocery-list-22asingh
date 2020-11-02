public class Student extends Person {
    // Instance variables:
    // firstName and lastName are already inheritted
    private int classYear;
    
    // Constructors
    // A constructor that takes three parameters for the
    // firstName, lastName, and classYear
    public Student(String a, String b, int c) {
        super(a, b);
        this.classYear = c;
    }

    // A default/no-argument constructor
    public Student() {
        super("Jerry", "Seinfeld");
        this.classYear = 2024;
    }

    // toString()
    @Override
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
        return str;
    }

    //doSomething
    @Override
    public void doSomething(){
        System.out.println("I'm studying.");
    }

    // Getters
    // We've already inheritted getFirstName() and getLastName()
    // so we only need to add getClassYear
    public int getClassYear() {
        return this.classYear;
    }
    
    // Setters
    public void setClassYear(int classYear) {
        if (classYear > 2020 && classYear <= 2025) {
            this.classYear = classYear;
        }
    }
}