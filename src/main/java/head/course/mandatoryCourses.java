package head.course;

public class mandatoryCourses extends courses{
    public mandatoryCourses() {
        super();
    }

    public mandatoryCourses(String subject, int credits, int time) {
        super(subject, credits, time);
    }

    @Override
    public String getCourseType() {
        return "Mandatory";
    }
}
