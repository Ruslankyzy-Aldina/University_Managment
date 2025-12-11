package head;

import head.course.courses;
//import head.professor.professor;
public class Main {
    public static void main(String[] args){
        courses course1=new courses();
        course1.subject = "Object-oriented programming";
        course1.credits = 5;
        course1.time = "14:00-16:00";
        courses course2 = new courses();
        course2.subject = "Introduction to Programming";
        course2.credits = 5;
        course2.time = "10:00-12:00";

        String course1Info = course1.program();
        String course2Info = course2.program();
        System.out.println(course1Info);
        System.out.println(course2Info);


    }
}
