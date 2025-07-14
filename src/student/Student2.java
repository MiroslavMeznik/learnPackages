package student;
//vsechny metody jsou PUBLIC
public class Student2 {
//vsechny vlastnosti - properties jsou PRIVATE
    private String name; //instance variable patri pouz tomuto zaznamu napr. jozko
    private int age; //instance variable
    public static int totalStudents = 0; // static promenna patri teto tride cele
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


