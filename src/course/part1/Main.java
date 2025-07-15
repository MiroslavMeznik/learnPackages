package course.part1;

public class Main {

    public static void main(String[] args) {
        Lecture lecture = new Lecture("Hardware", 8);

        //vytvorime kontajner na lekce?
        //compositio kompozice spojovani objektu
        //do kapitoly je vlozena lekce
        Chapter chapter = new Chapter("Uvod do informatiky", lecture);
        chapter.printInfo();




    }
}
