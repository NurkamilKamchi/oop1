import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// MyClass деген класс тузунуз
//
//Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//Параметри эки башка болгон эки конструктор тузунуз
//
//MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//
//Эки объектке эки башка конструктор иштесин.
//
//Объекттердин маанилерин консольго чыгарыныз
public class Main {


    public static void main(String[] args) {

        MyClass myClass = new MyClass("Nurkamil", "Kamchiev");
        myClass.lessons = new String[]{};
        myClass.meal = "tamak";
        getinfo(myClass);
        MyClass myClass1 = new MyClass(new String[]{"JAVA-12", "JS-12", "JAVA-11", "JS-12-KYRGYZ"}, "kjg");
        myClass1.name = "Nurbek";
        myClass1.surname = "Asanov";
        getinfo(myClass1);


    }

    public static void getinfo(MyClass myClass) {
        System.out.println(STR. """
                name: \{ myClass.name }
                surname:\{ myClass.surname }
                lessons:\{ Arrays.toString(myClass.lessons) }
                meal:\{ myClass.meal }
                """ );
    }
}








