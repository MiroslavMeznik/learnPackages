package course.part3;

public class Main {

    public static void main(String[] args) {

        Lecture lecture1 = new Lecture(" Hardware ", 8);
        Lecture lecture2 = new Lecture(" Software ", 7);
        Lecture lecture3 = new Lecture(" Binarni soustava ", 23);
        Lecture lecture4 = new Lecture(" Rozhodovaci strom ", 11);
        Lecture lecture5 = new Lecture(" Co je to algoritmus ", 9);

        //vytvorime kontajner na lekce?
        //compositio kompozice spojovani objektu
        //do kapitoly je vlozena lekce
        Chapter chapter = new Chapter("Uvod do informatiky");
        chapter.addLecture(lecture1);
        chapter.addLecture(lecture2);
        chapter.addLecture(lecture3);

        Chapter chapter2 = new Chapter("Ako robi pocitac rozhodnutia");
        chapter2.addLecture(lecture4);
        chapter2.addLecture(lecture5);

        Course course = new Course("Uvod do informatiky");
        course.addChapter(chapter);
        course.addChapter(chapter2);
        course.printInfo();
        course.printTotalDuration();

    }
}
