package head.course;

public class electiveCourses extends courses{
    public electiveCourses() {
        super();
    }

    public  electiveCourses(String subject, int credits, int time) {
        super(subject, credits, time);
    }


    @Override
    public String getCourseType() {
        return "Elective";
    }
}
