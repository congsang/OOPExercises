package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        System.out.println("Sort by age");
        //listDevs.sort((Developer o1, Developer o2)->o1.getAge()-o2.getAge());
        listDevs.sort(Comparator.comparingInt(Developer::getAge));
        //listDevs.forEach((developer)->System.out.println(developer));
        listDevs.forEach(System.out::println);

        System.out.println("Sort by name");
        listDevs.sort(Comparator.comparing(Developer::getName).reversed());
        listDevs.forEach(System.out::println);
    }

    private static List<Developer> getDevelopers() {
        List<Developer> result = new ArrayList<Developer>();
        result.add(new Developer("mkyong", 70000, 33));
        result.add(new Developer("alvin", 80000, 20));
        result.add(new Developer("jason", 100000, 10));
        result.add(new Developer("iris", 170000, 55));
        return result;
    }
}
