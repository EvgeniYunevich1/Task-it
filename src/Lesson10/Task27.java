package Lesson10;

import java.util.HashSet;

// Создать коллекцию, наполнить ее  случайными числами.Удалить повторяющиеся числа.
public class Task27 {
    public static HashSet<Integer> createSet() {

        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * 10);
            System.out.print(" " + random);
            integerHashSet.add(random);
        }
        System.out.println();
        return integerHashSet;
    }

    public static void main(String[] args) {
        System.out.println(createSet());
    }
}
