package Lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Produckt {
    public static ArrayList listproduckt() {
        ArrayList<String> list = new ArrayList<>();

        List<String> produckt = Arrays.asList("sugar , cream , biscuit ",
                "chocolade , eggs , chicken ",
                "beetroot , carrot ,  apricot",
                " avocado , melon , apple",
                "banana, bread");

        int numberOfElements = (int) (Math.random() * 4 + 1);
        String randomElement = produckt.get(numberOfElements);
        list.add(randomElement);
        return list;
    }

}



