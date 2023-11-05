public class School {
    private String name;
    private String addres;
    private int students;

    public School(){

    }
    public School(String name,String addres, int students){
        this.name=name;
        this.addres=addres;
        this.students=students;
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

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
}
