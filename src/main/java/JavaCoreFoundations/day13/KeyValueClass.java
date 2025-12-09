package JavaCoreFoundations.day13;

public class KeyValueClass <K, V> {

    private final K key;
    private final V value;

    public KeyValueClass(K key, V value){
        this.key = key;
        this.value= value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }

    public void printPair (){
        System.out.println("Key: " + key + " | Value: " + value);
    }
}
