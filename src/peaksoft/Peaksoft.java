package peaksoft;

import java.util.Arrays;

public class Peaksoft {

    private Group[] groups;
    private Student[] students;
    private Instructor[] instructors;
    private Mentor[] mentors;

    public Peaksoft() {
    }

    public Peaksoft(Group[] groups, Student[] students, Instructor[] instructors, Mentor[] mentors) {
        this.groups = groups;
        this.students = students;
        this.instructors = instructors;
        this.mentors = mentors;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }

    @Override
    public String toString() {
        return "Peaksoft \n" +
                "Группа: " + Arrays.toString(groups) +" \n"+
                "Студенты: " + Arrays.toString(students) +"\n "+
                "Инструкторы" + Arrays.toString(instructors) +"\n "+
                "Лучшие Менторы" + Arrays.toString(mentors);
    }
}

