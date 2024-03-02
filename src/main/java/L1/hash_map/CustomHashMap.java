package L1.hash_map;

import java.util.LinkedList;

/**
 * Своя реализация CustomHashMap
 */
public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {

    }

    public V get(K kye) {
        throw new RuntimeException();
    }

    public void remove(K key) {

    }

    public int getHash(K key) {
        throw new RuntimeException();
    }

}
