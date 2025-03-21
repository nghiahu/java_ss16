package generic;

public class ClassGeneric<K,V> {
    private K key;
    private V value;

    public ClassGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return "Mã: " + key.toString() + " Tên: " + value.toString();
    }
}
