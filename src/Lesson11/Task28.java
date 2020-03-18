package Lesson11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Создать список оценок учеников с помощью ArryList ,заполнить случайными оценками.
// Найти самую высокую оценку с использованием итератора.
public class Task28 {
    public static void main(String[] args) {
        List<Integer> count = random();
        System.out.println(random());
        System.out.println(maxMark(count));
    }

    private static List<Integer> random() {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < 25; i++) {
            list.add((int) (Math.random() * 10 + 1));
        }
        return list;
    }

    private static Integer maxMark(List<Integer> count) {
        Iterator<Integer> iterator = count.iterator();
        int maxCount = count.get(0);
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a > maxCount) {
                maxCount = a;
            }
        }
        return maxCount;

    }
}



