package peaksoft;

public class Student {
    private String studyName;
    private String group;

    public Student() {
    }

    public Student(String studyName, String group) {
        this.studyName = studyName;
        this.group = group;
    }

    public String getStudyName() {
        return studyName;
    }

    public void setStudyName(String studyName) {
        this.studyName = studyName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return studyName  +
                 group + '\n';
    }
}
