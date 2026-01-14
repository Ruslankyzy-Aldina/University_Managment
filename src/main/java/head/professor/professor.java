package head.professor;

public class professor {
    private String fullname;
    private int experience;
    //data pool array
    private professor[] professors = new professor[10];
    private int count = 0;


    public professor(String fullname, int experience) {
        this.fullname = fullname;
        this.experience = experience;
    }

    public professor() {}
    //adding info into array
    public void addProfessor(professor p){
        if(count< professors.length ){
            professors[count] =p;
            count++;
        }
    }
    //filtering
    public void filterByExperience(int minYears){
        for(int i =0; i<count; i++){
            if(professors[i].getExperience()>= minYears ){
                System.out.println(professors[i].teacher());
            }
        }
    }
    //searching
    public void searchByFullname(String keyword){
        for(int i=0; i<count; i++){
            if(professors[i].getFullname().toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(professors[i].fullname);
            }
        }
    }
    //bubble sort
    public void sortByExperience(){
        for(int i =0; i<count -1; i++){
            for(int j=0; j<count -1; j++){
                if(professors[i].experience> professors[j+1].experience){
                    professor temp = professors[j];
                    professors[j] = professors[j+1];
                    professors[j+1] = temp;
                }
            }
        }
    }
    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(professors[i]);
        }
    }
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String teacher() {
        return this.fullname + " " + this.experience + " years";
    }
}
