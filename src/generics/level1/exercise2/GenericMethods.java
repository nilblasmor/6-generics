package generics.level1.exercise2;

public class GenericMethods {

    public static <T, U, V> void printElements(T e1, U e2, V e3) {
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }

}
