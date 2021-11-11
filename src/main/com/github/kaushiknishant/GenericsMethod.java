package main.com.github.kaushiknishant;

public class GenericsMethod {
    // void generic method
    private <T> void showItems(T t){
        System.out.println(t);
    }

    // return from generic method
    private <T> T returnNumber(T t){
        return t;
    }

    // use more than one argument in generic method
    private <T,V> void printNumber(T t, V v){
        System.out.println(t +" " + v);
    }

    public static void main(String[] args) {
        GenericsMethod method = new GenericsMethod();
        method.showItems(23);
        System.out.println(method.returnNumber(33));
        method.printNumber(56,66);
    }
}
