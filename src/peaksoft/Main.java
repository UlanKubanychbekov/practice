package peaksoft;

public class Main {

    public static void main(String[] args) {

        Group group =new Group("Java-5","03.01.2022", 50);
        Group group1 = new Group("JavaSkr-5","03.01.2022",40);
        Group group2 = new Group("Java-4","03.10.2021",60);
        Group group3 = new Group("JavaSkr-4","03.10.2021",45);
        Group[] groups = {group, group2,group1,group3};

        Student student = new Student("Алмаз", ": Java-5");
        Student student1 = new Student("Нургазы" ,": Java-5");
        Student student2 = new Student("Мухаммед" ,": Java-5");
        Student student3 = new Student("Курманбек",": Java-5");
        Student student4 = new Student("Максат", ": Java-5");
        Student student5 = new Student("Дильбара", ": Java-5");
        Student student6 = new Student("Кунзаада", ": Java-5");
        Student student7 = new Student("Айчурок" ,": Java-5");
        Student [] students = {student, student1,student2,student3,student4,student5,student6,student7};

        Instructor instructor = new Instructor("Замир Сабыржанов", " Старший инструктор"," Понедельник - Среда");
        Instructor instructor1 = new Instructor("Мухаммед Алланов"," Инструктор BackEnd"," Вторник - Четверг");
        Instructor [] instructors = {instructor,instructor1};

        Mentor mentor = new Mentor("Айжан Нурматова");
        Mentor mentor1 = new Mentor("Бексултан");
        Mentor mentor2 = new Mentor("Чынгыз Шаршекеев");
        Mentor[] mentors = {mentor,mentor1, mentor2};
        
        Peaksoft peaksoft = new Peaksoft(groups, students,instructors,mentors );

        System.out.println(peaksoft);



    }
}
