package student;
//vsechny metody jsou PUBLIC
public class Student {
//vsechny vlastnosti - properties jsou PRIVATE
    private String name;
    private int age;
    private int totalStudents = 0;

    public Student(String name, int age) {
        //constructor
        this.name = name;
        this.age = age;
        totalStudents++;
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
    public int getTotalStudents(){
        return totalStudents;

    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;

    }

}


