package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map01 = new HashMap<>();
        map01.put(1000, "Pavel Kuzmin");
        map01.put(32, "Anton Kuzmin");
        map01.put(3432, "Anna Ru");
        map01.put(23234, "Nikolay Petroff");
        map01.putIfAbsent(1000, "Nikolay Petroff");

        System.out.println(map01.get(1000));
        System.out.println(map01);
    }
}
