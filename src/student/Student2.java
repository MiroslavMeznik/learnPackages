package student;
//vsechny metody jsou PUBLIC
public class Student2 {
//vsechny vlastnosti - properties jsou PRIVATE
    private String name;
    private int age;
    public static int totalStudents = 0;
    public static final int MINIMUM_AGE = 15; //pouzivame poze na konstanty
    //constatnt piseme CAPSLOCK

    public Student2(String name, int age) {
        //constructor
        this.name = name;
        this.age = age;
        this.totalStudents++;
    }

    public void printInfo() {
        System.out.println("Jmeno je " + this.name);
        System.out.println("Vek je " + this.age + " rokov");
    }

    //getters
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

}


