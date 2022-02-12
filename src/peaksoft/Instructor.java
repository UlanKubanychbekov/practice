package peaksoft;

public class Instructor {
    private String nameLesson;
    private String position;
    private String dayTeach;


    public Instructor() {
    }

    public Instructor(String nameLesson, String position, String dayTeach) {
        this.nameLesson = nameLesson;
        this.position = position;
        this.dayTeach = dayTeach;
    }

    public String getNameLesson() {
        return nameLesson;
    }

    public void setNameLesson(String nameLesson) {
        this.nameLesson = nameLesson;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDayTeach() {
        return dayTeach;
    }

    public void setDayTeach(String dayTeach) {
        this.dayTeach = dayTeach;
    }

    @Override
    public String toString() {
        return
                "ФИО: " +nameLesson + "\n Должность: "+
                 position + "\n График работы: "+
                 dayTeach + '\n' ;
    }
}
