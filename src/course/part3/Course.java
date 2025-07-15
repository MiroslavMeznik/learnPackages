package course.part3;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Chapter> chapters;

    //constructor
    public Course(String name) {
        this.name = name;
        this.chapters = new ArrayList<>();
    }
    public void printTotalDuration(){
        int finalDuration = 0;
        for (Chapter chapter: this.chapters){
            finalDuration += chapter.getTotalDuration();
        }
        System.out.println("Total duration of course is " + finalDuration);

    }
    public void addChapter(Chapter chapter) {
        this.chapters.add(chapter);
    }

    public void printInfo() {
        System.out.println("Course " + this.name);
        System.out.println("--------------------------");
        for (Chapter chapter : this.chapters) {
            chapter.printInfo();
            System.out.println("--------------------------");

        }
    }
}
