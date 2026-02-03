package generics.level1.exercise1;

public class Main {

    public static void main(String[] args) {

        NoGenericMethods e1 = new NoGenericMethods("A", "B", "C");

        NoGenericMethods e2 = new NoGenericMethods(10, "Piranha", 3.5);

        System.out.println(e1.getElement1());
        System.out.println(e2.getElement1());
        System.out.println(e2.getElement2());

    }

}
