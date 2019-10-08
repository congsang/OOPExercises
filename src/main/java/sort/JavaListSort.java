package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaListSort {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        for (String str : strList) System.out.println(" " + str);
    }
}
