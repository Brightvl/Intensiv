package L1.array_list;

public class Main {
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();
        customArrayList.add(25);
        customArrayList.add(26);
        customArrayList.add(27);
        customArrayList.remove(1);
        System.out.println(customArrayList.get(1));
    }
}