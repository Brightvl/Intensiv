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

    public V get(K key) {
        int index = getHash(key) % DEFAULT_CAPACITY;
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null;
    }

    public void remove(K key) {

    }

    public int getHash(K key) {
        return key == null ? 0 : key.hashCode();
    }

}
