package JavaCoreFoundations.day13;

public class GenericsBasics<T> {
    private T value;

    public GenericsBasics(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
