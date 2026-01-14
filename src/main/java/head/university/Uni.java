package head.university;

public class Uni {
    private String name;
    private int years;
    private String city;

    //data pool array
    private Uni[] universities = new Uni[10];
    private int count = 0;

    public Uni(String name,String city, int years){
        this.name=name;
        this.years = years;
        this.city = city;

    }

    public Uni() {

    }
    //adding info into array
    public void addUniversity(Uni u){
        if(count < universities.length){
            universities[count] = u;
            count++;
        }
    }
    //filter
    public void filterByCity(String f_city){
        for(int i =0; i< count; i++){
            if(universities[i].getCity().equalsIgnoreCase(f_city)){
                System.out.println(universities[i].print());
            }
        }
    }
    //search
    public void searchByName(String keyword){
        for(int i=0; i<count; i++){
            if(universities[i].getName().toLowerCase().contains(keyword.toLowerCase())){
                System.out.println(universities[i].name);
            }
        }
    }
    //bubble sort
    public void sortByYears() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (universities[j].years > universities[j + 1].years) {
                    Uni temp = universities[j];
                    universities[j] = universities[j + 1];
                    universities[j + 1] = temp;
                }
            }
        }
    }
    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(universities[i]);
        }
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears(){
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String City){
        this.city = City;
    }

    public String print(){
        return this.name + " "+ this.years + " years " + this.city ;
    }

}
