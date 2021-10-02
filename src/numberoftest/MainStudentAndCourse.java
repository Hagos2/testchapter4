package numberoftest;

public class MainStudentAndCourse {
    public static void main(String[] args) {
        Course co1 = new Course("cs201", "prop", 4);
        Student s1 = new Student(  "  Gere  " ,      112940  ,         4.0 , co1);
        Student s2 = new Student("hagos" , 112941,   3.5,  co1);
        System.out.println(s1);
        System.out.println(s2);



    }
}