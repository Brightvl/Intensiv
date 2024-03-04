package L1.hash_map;

import java.util.LinkedList;

/**
 * Своя реализация CustomHashMap
 */
public class CustomHashMap<K, V> {

    private static final int DEFAULT_CAPACITY = 16;
    private final LinkedList<Entry<K, V>>[] buckets;

    public CustomHashMap() {
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    /**
     * Добавляет значение по ключу в словарь
     *
     * @param key   ключ
     * @param value значение
     */
    public void put(K key, V value) {
        int index = getHash(key) % DEFAULT_CAPACITY;
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                entry.setValue(value);
                return;
            }
        }

        bucket.add(new Entry<>(key, value));
    }


    /**
     * Получить значение по ключу
     *
     * @param key ключ
     * @return значение словаря
     */
    public V get(K key) {
        int index = getHash(key) % DEFAULT_CAPACITY;
        LinkedList<Entry<K, V>> bucket = buckets[index];

        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }

        return null; // Key not found
    }


    /**
     * Удаляет значение по ключу
     *
     * @param key ключ
     */
    public void remove(K key) {
        int index = getHash(key) % DEFAULT_CAPACITY;
        LinkedList<Entry<K, V>> bucket = buckets[index];

        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : bucket) {
            if (entry.getKey().equals(key)) {
                toRemove = entry;
                break;
            }
        }

        if (toRemove != null) {
            bucket.remove(toRemove);
        }
    }


    /**
     * Получить хэш код ключа
     *
     * @param key ключ
     * @return int
     */
    public int getHash(K key) {
        return key == null ? 0 : key.hashCode();
    }
}
