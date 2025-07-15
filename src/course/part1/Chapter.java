package course.part1;

public class Chapter {
    private String title;
    private Lecture lecture; //kapitola ma lekce chapter contains lectures

    //constructor
    public Chapter(String title, Lecture lecture){
        this.title = title;
        this.lecture = lecture;
    }

    public void printInfo(){
        System.out.println("Chapter " + this.title);
        this.lecture.printInfo();

    }



}
