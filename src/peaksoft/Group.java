package peaksoft;

public class Group {
    private String nameGroup;
    private String dataOfstudy;
    private int students;

    public Group(){

    }

    public Group(String nameGroup, String dataOfstudy, int students) {
        this.nameGroup = nameGroup;
        this.dataOfstudy = dataOfstudy;
        this.students = students;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public String getDataOfstudy() {
        return dataOfstudy;
    }

    public void setDataOfstudy(String dataOfstudy) {
        this.dataOfstudy = dataOfstudy;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }@Override
    public String toString(){
        return " группа-"+getNameGroup()+"  дата вступления - "+" "+dataOfstudy +", кол-во студентов: "+students;

}
    }

