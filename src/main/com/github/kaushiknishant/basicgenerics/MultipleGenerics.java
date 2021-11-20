package main.com.github.kaushiknishant.basicgenerics;

// Two generics are used here
class Table<K,V>{
    private K key;
    private V value;

    public Table(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Table{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

public class MultipleGenerics {
    public static void main(String[] args) {
        Table<String,Integer> table = new Table<>("INR",700);
        System.out.println(table);
    }
}
