package L1.hash_map;

public class Main {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> hashMap = new CustomHashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println("Value for key 'two': " + hashMap.get("two"));

        hashMap.remove("two");

        System.out.println("Value for key 'two' after removal: " + hashMap.get("two"));

    }
}
