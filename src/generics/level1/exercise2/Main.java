package generics.level1.exercise2;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("John", "Wick", 42);

        GenericMethods.printElements(p, "Sayonara", 12);

    }

}
