package head.professor;

public class professor {
    public String fullname;
    public int experience;


    public professor(String fullname, int experience){
        this.fullname = fullname;
        this.experience = experience;
    }
    public professor(){

    }
    public String getfullname(){
        return fullname;
    }
    public void setfullname(){
        this.fullname =fullname;
    }
    public int getExperience(){
        return experience;
    }
    public void setExperience(){
        this.experience = experience;
    }
    public String teacher(){
        return this.fullname + " "+ this.experience + " years";
    }

}
