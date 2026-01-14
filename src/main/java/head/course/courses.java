package head.course;

public class courses {
    private String subject;
    private int credits;
    private int time;
    //data pool array
    private courses[] courseList = new courses[10];
    private int count = 0;
    //constructor
    public courses(String subject, int credits, int time ){
        this.subject = subject;
        this.credits = credits;
        this.time = time;
    }
    public courses(){

    }
    //adding info into array
    public void addCourse(courses c){
        if(count < courseList.length){
            courseList[count]= c;
            count++;
        }
    }
    //filter
    public void filterByCredits(int minCredits){
        for(int i=0; i<count; i++){
            if(courseList[i].getCredits()>=minCredits){
                System.out.println(courseList[i].program());
            }
        }
    }
    //search
    public void searchBySubject(String keyword){
        for(int i=0; i<count; i++){
            if(courseList[i].getSubject().toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(courseList[i].subject);
            }
        }
    }
    //bubble sort
    public void sortByTime() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (courseList[j].time > courseList[j + 1].time) {
                    courses temp = courseList[j];
                    courseList[j] = courseList[j + 1];
                    courseList[j + 1] = temp;
                }
            }
        }
    }
    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(courseList[i]);
        }
    }
    //parameters
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits){
        this.credits = credits;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    //methods
    public String program(){
        return this.subject + " "+ this.credits+ " credits " + this.time +" hours";
    }

}
