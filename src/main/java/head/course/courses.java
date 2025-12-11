package head.course;

public class courses {
    //constructor
    public courses(){
    }
    //parameters
    public String subject;
    public int credits;
    public String time;
    //methods
    public String program(){
        return this.subject + " "+ this.credits+ " credits " + this.time;
    }

}
