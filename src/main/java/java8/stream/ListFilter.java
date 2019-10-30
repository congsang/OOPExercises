package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {

    public static void main(String[] args) {
        List<String> lines = Arrays.asList("A", "V", "D");
        List<String> result = lines.stream()                // convert list to stream
                .filter(line -> !"V".equals(line))          // filter
                .collect(Collectors.toList());              // collect the output and convert streams to a List
        result.forEach(System.out::println);

        List<Person> persons = Arrays.asList(
                new Person("A", 30),
                new Person("B", 20),
                new Person("C", 40)
        );

        Person result1 = persons.stream()                   // convert to steam
                .filter(x -> "A".equals(x.getName()))       // we want "A" only
                .findAny()                                  // if 'findAny' then return found
                .orElse(null);                       // if not found, return null
        System.out.println(result1);

        Person result2 = persons.stream()
                .filter(x -> "D".equals(x.getName()))
                .findAny()
                .orElse(null);

        System.out.println(result2);

        //or like this
        Person result3 = persons.stream()
                .filter(p -> "B".equals(p.getName()) && 20 == p.getAge())
                .findAny()
                .orElse(null);

        System.out.println("result 3 :" + result3);
    }
}
