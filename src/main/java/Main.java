import L1.array_list.CustomArrayList;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;

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
