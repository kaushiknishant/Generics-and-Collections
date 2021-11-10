package main.com.github.kaushiknishant;

/**
 * Author - Nishant Sharma
 * Date - 10-11-2021
 * A Guide to Understand Generics - These programs are written to understanding the generics in java.
 * Java best practices may or may not be used here.
 */

// In first example.We are using int data type if we want to use other data type than program will give us an error on compile time.
// If we want to us below methods for different data type , we have to use method overloading
/* class Store {
    private int numOfItems;

    public int getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }
}

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        store.setNumOfItems(45); // if we use 45.5 then program will give us compile time error
        int item = store.getNumOfItems();
        System.out.println(item);
    }
} */

// In second example. we are using type casting we have to manually do type casting
/* class Store {
    private Object numOfItems;

    public Object getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(Object numOfItems) {
        this.numOfItems = numOfItems;
    }
}

public class App {
    public static void main(String[] args) {
        Store store = new Store();
        store.setNumOfItems(45);
        Integer item = (Integer)store.getNumOfItems(); // we are using type casting here
        System.out.println(item);
    }
} */

// In third example, we are using generics, and we will see how generics are solving our problems.
class Store<T> {
    private T numOfItems;

    public T getNumOfItems() {
        return numOfItems;
    }

    public void setNumOfItems(T numOfItems) {
        this.numOfItems = numOfItems;
    }
}

public class BasicGenerics {
    public static void main(String[] args) {
        Store<Integer> store = new Store<>(); // by providing data type we can use this program for different data type
        store.setNumOfItems(45);
        Integer item = store.getNumOfItems();
        System.out.println(item);
    }
}
