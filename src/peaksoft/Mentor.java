package peaksoft;

public class Mentor {
    private String lesson;


    public Mentor() {
    }

    public Mentor(String lesson) {

        this.lesson = lesson;

    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }


    @Override
    public String toString() {
        return lesson + " ";

    }
}