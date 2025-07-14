//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import student.Student;
import student.Student2;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        //OOP podivat se na videa


   Student student = new Student("Gogo", 35);
   student.setName("Stanino");
        Student student2 = new Student("Michala", 28);
        student.printInfo();
        student2.printInfo();
        System.out.println("Jmeno studenta je " + student.getName() + " vek je: " + student.getAge());
        student2.setName("Misa");
        student2.setAge(26);
        System.out.println("Jmeno studenta je " + student2.getName() + " vek je: " + student2.getAge());
        Student2  jozko = new Student2("Jozko", 35);
        Student2  marek = new Student2("Marek", 20);
        Student2  misa = new Student2("Misa", 26);
        System.out.println("Total student je " + Student2.totalStudents);
        Student  jozko2 = new Student("Jozko", 35);
        Student  marek2 = new Student("Marek", 20);
        Student  misa2 = new Student("Misa", 26);
        System.out.println(jozko2.getTotalStudents());
    }
}
