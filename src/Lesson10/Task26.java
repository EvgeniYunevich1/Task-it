package Lesson10;

import java.util.*;

// Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками .Удалить неудовлетворительные
// оценки из списка.
public class Task26 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        int noGoodMarks = 3;
        int mark = 9;
        for (int i = 0; i <= mark; i++) {
            marks.add(i, (int) (Math.random() * 10 + 1));
        }
        System.out.println(marks);
        marks.removeIf(s -> s <= noGoodMarks);
    }
}
