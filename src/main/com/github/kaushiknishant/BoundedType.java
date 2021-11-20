package main.com.github.kaushiknishant;

/**
 * Whenever you want to restrict the type parameter to subtypes of a particular class you can use the bounded type parameter.
 * If you just specify a type (class) as bounded parameter, only subtypes of that particular class are accepted by the current generic class.
 * These are known as bounded-types in generics in Java.
 */
public class BoundedType {
    private <T extends Comparable<T>> T findMinimum(T num1, T num2){
        if(num1.compareTo(num2) < 0)
            return num1;
        return num2;
    }

    public static void main (String[] args) {
        BoundedType bt = new BoundedType();
        System.out.println(bt.findMinimum(56.6,7.8));
    }
}
