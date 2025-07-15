package course.part2;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String title;
    private List<Lecture> lectures; //kapitola ma lekce chapter contains lectures

    //constructor
    public Chapter(String title) {
        this.title = title;
        this.lectures = new ArrayList<>();
    }

    public void addLecture(Lecture lecture) {
        this.lectures.add(lecture);

    }

    public void printTotalDuration(){
        int duration = 0;
        for (Lecture lecture: this.lectures){
            duration +=lecture.getDuration();

        }
        System.out.println("====Total duration of chapter is " + duration + "=====");
    }

    public void printInfo() {
        System.out.println("Chapter " + this.title);
        for (Lecture lecture : this.lectures) {
            lecture.printInfo();
        }
    }


}
