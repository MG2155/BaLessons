package BaLessons.Lesson16;

public class Person {

    public static int number;
    public String name;
    public String lastName;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        number++;
    }

    public static int getNumber() {
        return number;
    }

    public void printName() {
        System.out.println(name + " " + lastName);
    }

}
