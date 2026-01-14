package head;

import head.course.courses;
import head.university.Uni;
import head.professor.professor;
public class Main {
    public static void main(String[] args){
        courses course1=new courses();
        course1.setSubject("Introduction to Programming");
        course1.setCredits(5);
        course1.setTime(2);
        courses course2 = new courses();
        course2.setSubject("Object-oriented programming");
        course2.setCredits(5);
        course2.setTime(5);

        String course1Info = course1.program();
        String course2Info = course2.program();
        System.out.println(course1Info);
        System.out.println(course2Info);
        if (course1.getTime() < course2.getTime()) {
            System.out.println(course1.getSubject() +" < "+ course2.getSubject());
        }
        else{
            System.out.println(course1.getSubject() +" > "+ course2.getSubject());
        }

        professor professor1 = new professor();
        professor1.setFullname("Ayim Nurbolkyzy");
        professor1.setExperience(5);
        professor professor2 = new professor();
        professor2.setFullname("Kiril Trimakov");
        professor2.setExperience(2);
        String professor1Info = professor1.teacher();
        String professor2Info = professor2.teacher();
        System.out.println(professor1Info);
        System.out.println(professor2Info);
        if(professor1.getExperience() > professor2.getExperience() ){
            System.out.println(professor1.getFullname() + " has more experience");
        }
        Uni Uniname1 = new Uni();
        Uniname1.setName("Astana IT University");
        Uniname1.setCity("Astana");
        Uniname1.setYears(6);

        Uni Uniname2 = new Uni();
        Uniname2.setName("KBTU");
        Uniname2.setCity("Almaty");
        Uniname2.setYears(24);
        String Uni1Info = Uniname1.print();
        String Uni2Info = Uniname2.print();
        System.out.println(Uni1Info);
        System.out.println(Uni2Info);

        if(Uniname1.getCity().equals("Astana")){
            System.out.println("It is good university: "+ Uniname1.getName()+"\n");
        }
        professor p = new professor();
        p.addProfessor(new professor("Ali Bekov", 5));
        p.addProfessor(new professor("Dana Kenzhe", 12));
        p.addProfessor(new professor("Arman Suleimenov", 8));
        p.addProfessor(new professor("Aigerim Ruslanova", 4));

        Uni u = new Uni();
        u.addUniversity(new Uni("ENU", "Astana", 27));
        u.addUniversity(new Uni("KazNU", "Almaty", 90));
        u.addUniversity(new Uni("Nazarbayev University", "Astana", 15));

        courses c = new courses();
        c.addCourse(new courses("Calculus 1", 5, 60));
        c.addCourse(new courses("Data structure and Algorithms", 6, 65));
        c.addCourse(new courses("History of Kazakhstan", 2, 30));

        p.filterByExperience(0);
        u.filterByCity("Astana");
        c.filterByCredits(0);

        p.searchByFullname("an");
        u.searchByName("NU");
        c.searchBySubject("st");

        p.sortByExperience();
        u.sortByYears();
        c.sortByTime();

        p.showAll();
        u.showAll();
        c.showAll();



    }


}
