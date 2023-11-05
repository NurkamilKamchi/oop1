public class University {
    private String name;
    private String addres;
    private int numberOfFaculty;

    public University(){

    }
    public University(String name,String addres,int numberOfFaculty){
        this.name=name;
        this.addres=addres;
        this.numberOfFaculty=numberOfFaculty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getNumberOfFaculty() {
        return numberOfFaculty;
    }

    public void setNumberOfFaculty(int numberOfFaculty) {
        this.numberOfFaculty = numberOfFaculty;
    }
}
