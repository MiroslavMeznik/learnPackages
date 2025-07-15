package course.part3;

public class Lecture {
    private String title;
    private int duration;

    public Lecture(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void printInfo() {
        System.out.println("Lecture" + this.title + " has duration " + this.duration);
    }
}
