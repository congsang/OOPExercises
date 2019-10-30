package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

    public static void main(String[] args) {
        // loop a map with forEach()
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);
        map.put("E", 50);
        map.put("F", 60);
        map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        map.forEach((k, v) -> {
            System.out.println("Key: " + k + " Value: " + v);
            if ("E".equals(k)) {
                System.out.println("Hello E");
            }
        });

        // loop a list with forEach()
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        //lambda
        //Output : A,B,C,D,E
        list.forEach(item->System.out.println(item));

        //Output : C
        list.forEach(item->{
            if("C".equals(item)){
                System.out.println(item);
            }
        });

        //method reference
        //Output : A,B,C,D,E
        list.forEach(System.out::println);

        //Stream and filter
        //Output : B
        list.stream()
                .filter(s->s.contains("B"))
                .forEach(System.out::println);
    }
}
