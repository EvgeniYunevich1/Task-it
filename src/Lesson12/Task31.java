package Lesson12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;

public class Task31 {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileWriter writer = new FileWriter("TextCount.txt", false))
        {
            String text="Предвижу всё: в123ас оскорбит\n" +
                    "Печальной тайны объясн12314енье.\n" +
                    "Какое горькое презренье\n" +
                    "Ваш гордый взгляд изобразит!\n" +
                    "Чего хочу? с какою целью\n" +
                    "Открою душу вам свою ?";
            writer.write(text);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        String s = "";
        Scanner in = new Scanner(new File("TextCount.txt"));
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






