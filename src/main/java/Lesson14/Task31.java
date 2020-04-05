package Lesson14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class Task31 {
    private static String text = "Предвижу всё: в123ас оскорбит\n" +
            "Печальной тайны объясн12314енье.\n" +
            "Какое горькое презренье\n" +
            "Ваш гордый взгляд изобразит!\n" +
            "Чего хочу? с какою целью\n" +
            "Открою душу вам свою ?";
    String s = "";

    public static void main(String[] args) {
        writeText();
        readAndOpereshen();

    }

    private static void writeText() {
        try (FileWriter writer = new FileWriter("TextCount.txt", false)) {

            writer.write(text);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

    private static void readAndOpereshen() {
        String s = "";
        Scanner in = null;
        try {
            in = new Scanner(new File("TextCount.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        while (in.hasNext()) {// читаю файл
            s += in.nextLine() + "\r\n";
        }
        System.out.println("Текст из файла : \n" + s);
        in.close();
        String number = s.replaceAll("[^0-9]", "");//вывожу все цифры из файла в строку
        System.out.println("Числа в тексте : " + number);
        int[] numArr = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        int sum = IntStream.of(numArr).sum();//считаю сумму чисел в тексте
        System.out.println("Сумма чисел в тексте : " + sum);
        System.out.println("Не повторяющиеся числа : " + Arrays.toString(IntStream.of(numArr).distinct().toArray()));

    }

}


