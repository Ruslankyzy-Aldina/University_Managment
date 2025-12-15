package head;

import head.course.courses;
import head.university.Uni;
import head.professor.professor;
public class Main {
    public static void main(String[] args){
        courses course1=new courses();
        course1.subject = "Introduction to Programming";
        course1.credits = 5;
        course1.time = 2;
        courses course2 = new courses();
        course2.subject = "Object-oriented programming";
        course2.credits = 5;
        course2.time = 5;

        String course1Info = course1.program();
        String course2Info = course2.program();
        System.out.println(course1Info);
        System.out.println(course2Info);
        if (course1.time < course2.time) {
            System.out.println(course1.subject +" < "+ course2.subject);
        }
        else{
            System.out.println(course1.subject +" > "+ course2.subject);
        }

        professor professor1 = new professor();
        professor1.fullname = "Ayim Nurbolkyzy";
        professor1.experience = 5;
        professor professor2 = new professor();
        professor2.fullname = "Kiril Trimakov";
        professor2.experience = 2;
        String professor1Info = professor1.teacher();
        String professor2Info = professor2.teacher();
        System.out.println(professor1Info);
        System.out.println(professor2Info);
        if(professor1.experience > professor2.experience ){
            System.out.println(professor1.fullname + " has more experience");
        }
        Uni Uniname1 = new Uni();
        Uniname1.name = "Astana IT University";
        Uniname1.city = "Astana";
        Uniname1.years = 6;

        Uni Uniname2 = new Uni();
        Uniname2.name = "KBTU";
        Uniname2.city = "Almaty";
        Uniname2.years = 24;
        String Uni1Info = Uniname1.print();
        String Uni2Info = Uniname2.print();
        System.out.println(Uni1Info);
        System.out.println(Uni2Info);

        if(Uniname1.city == "Astana"){
            System.out.println("It is good university: "+ Uniname1.name);
        }
    }


}
