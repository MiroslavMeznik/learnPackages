package course.part2;

public class Main {

    public static void main(String[] args) {

        Lecture lecture1 = new Lecture(" Hardware ", 8);
        Lecture lecture2 = new Lecture(" Software ", 7);
        Lecture lecture3 = new Lecture(" Binarni soustava ", 13);

        //vytvorime kontajner na lekce?
        //compositio kompozice spojovani objektu
        //do kapitoly je vlozena lekce
        Chapter chapter = new Chapter("Uvod do informatiky");
        chapter.addLecture(lecture1);
        chapter.addLecture(lecture2);
        chapter.addLecture(lecture3);

        chapter.printInfo();
        chapter.printTotalDuration();


    }
}
