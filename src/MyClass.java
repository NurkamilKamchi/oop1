public class MyClass {
    String name;
    String surname;
    String[] lessons;
    String meal;

    public MyClass(String name, String surname) {
        this.name=name;
        this.surname=surname;
    }

    public MyClass(String[] lessons, String meal) {
        this.lessons=lessons;
        this.meal=meal;
    }
}


//    MyClass деген класс тузунуз
//
//    Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//        Параметри эки башка болгон эки конструктор тузунуз
//
//        MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//
//        Эки объектке эки башка конструктор иштесин.
//
//        Объекттердин маанилерин консольго чыгарыныз