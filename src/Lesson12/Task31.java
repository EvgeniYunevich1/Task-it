package Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.IntStream;

public class Task31 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "";
        Scanner in = new Scanner(new File("notes3.txt"));
        while (in.hasNext()) {//читаю файл
            s += in.nextLine() + "\r\n";
        }
        System.out.println("Числа в тексте " + s);
        in.close();
        String number = s.replaceAll("[^0-9]", "");//вывожу все чифры из файла в строку
        System.out.println(number);
        int[] numArr = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).toArray();
        //перевожу эти цифры в масив
        int sum = IntStream.of(numArr).sum();//считаю суму чисел в тексте
        System.out.println("Сумма чисел в тексте : " + sum);
        //вывожу не пофторяющиеся числа
        System.out.println("Не пофторяющийся числа : " + Arrays.toString(IntStream.of(numArr).distinct().toArray()));
    }
}






