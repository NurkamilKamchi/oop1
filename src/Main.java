//University, School, Car жана Person деген класс тузунуз
//
//Алардын свойстваларын ойлоп табыныз
//
//Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз
public class Main {
    public static void main(String[] args) {
        System.out.println("Cars:");
        Car car = new Car("Honda", "Stream", 2);
        Car car1 = new Car();
        Car car2 = new Car();
        car.setBrand("honda");
        car.setModel("stream");
        car.setVoluem(5);
        car1.setBrand("toyota");
        car1.setModel("Camry");
        car1.setVoluem(3);
        car2.setBrand("Mersedes");
        car2.setModel("S-class");
        car2.setVoluem(5);

        Car[] cars = {car1, car2, car};
        for (Car someCar : cars) {
            System.out.println(someCar.getBrand() + ", " + someCar.getModel() + ", " + someCar.getVoluem());
        }

        System.out.println("People:");
        Person person = new Person();
        Person person1 = new Person();
        Person person2 = new Person();
        person.setName("Nurkamil");
        person.setProfession("Programmer");
        person.setAge(22);
        person1.setName("Nurbek");
        person1.setProfession("Dentist");
        person1.setAge(19);
        person2.setName("Bek");
        person2.setProfession("Driver");
        person2.setAge(25);

        Person[] people = {person, person1, person2};
        for (Person eachPerson : people) {
            System.out.println(eachPerson.getName() + ", " + eachPerson.getProfession() + ", " + eachPerson.getAge());
        }
        System.out.println("Schools:");
        School school = new School();
        School school1 = new School();
        School school2 = new School();
        school.setName("M.Baetov");
        school.setAddres("Leylek");
        school.setStudents(300);
        school1.setName("Gymnasia");
        school1.setAddres("village:Jashtyk");
        school1.setStudents(200);
        school2.setName("TurkishSchool");
        school2.setAddres("Kadamjay");
        school2.setStudents(500);
        School[] schools = {school, school1, school2};
        for (School eachSchool : schools) {
            System.out.println(eachSchool.getName() + ", " + eachSchool.getAddres() + ", " + eachSchool.getStudents());
        }
        System.out.println("Universities:");

        University university = new University();
        University university1 = new University();
        University university2 = new University();
        university.setName("KNU");
        university.setAddres("Jibek jolu");
        university.setNumberOfFaculty(21);
        university1.setName("KGUSTA");
        university1.setAddres("Maldybaeva");
        university1.setNumberOfFaculty(18);
        university2.setName("AUCA");
        university2.setAddres("Kok jar");
        university2.setNumberOfFaculty(25);
        University[] universities = {university, university1, university2};
        for (University eachUniversiity : universities) {
            System.out.println(eachUniversiity.getName() + ", " + eachUniversiity.getAddres() + ", " + eachUniversiity.getNumberOfFaculty());
        }

    }


}













