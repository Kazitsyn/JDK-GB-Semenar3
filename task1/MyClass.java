package task1;

import java.io.DataInput;
import java.io.InputStream;

public class MyClass <T extends Comparable<T>, V extends InputStream & DataInput, K extends  Number>{

    private T type;
    private V value;
    private K key;


    @Override
    public String toString() {
        return "MyClass{" +
                "type=" + type +
                ", value=" + value +
                ", key=" + key +
                '}';
    }

    public MyClass(T type, V value, K key) {
        this.type = type;
        this.value = value;
        this.key = key;
    }

    public T getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }




}
