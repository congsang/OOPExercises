package java8.stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapFilter {

    public static void main(String[] args) {
        Map<Integer, String> hosting = new HashMap<>();
        hosting.put(1, "linode.com");
        hosting.put(2, "heroku.com");
        hosting.put(3, "digitalocean.com");
        hosting.put(4, "aws.amazon.com");

        // map -> stream -> filter -> collect
        Map<Integer, String> collect = hosting.entrySet().stream()
                .filter(map -> map.getKey() == 2)
                .collect(Collectors.toMap(k -> k.getKey(), v -> v.getValue()));
        System.out.println(collect);

        Map<Integer, String> collect2 = hosting.entrySet().stream()
                .filter(map -> map.getKey() <= 3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect2);
    }
}
