package Lesson14;

import java.io.*;
import java.util.*;

//Записать в двоичный файл 20 случайных чисел.Прочитать записанный файл, распечатать  и их среднее арифметическое.
public class Task32 {
    public static void main(String[] args) {
        wreitFail();
        opereshenToFile();

    }

    private static void wreitFail() {

        DataOutputStream text = null;
        try {
            text = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Text.data")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        for (int i = 0; i < 20; i++) {
            try {
                text.writeInt(((int) (Math.random() * 10 + 1)));
            } catch (IOException e) {
                System.out.println("Файла не существует");
                ;
            }
        }
        try {
            text.close();
        } catch (IOException e) {
            System.out.println("Файл не существует");
            ;
        }
    }

    private static void opereshenToFile() {
        ArrayList<Integer> count = new ArrayList<>();
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("Text.data")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        int res = 0;
        try {
            res = dataInputStream.readInt();
        } catch (IOException e) {
            System.out.println("Файла нет");
        }
        System.out.println("Числа в файл");
        while (true) {
            System.out.print(res + " ");
            count.add(res);
            try {
                res = dataInputStream.readInt();
            } catch (EOFException e) {
                break;
            } catch (IOException e) {
                System.out.println("ERROR");
            }
        }
        if (dataInputStream != null) {
            try {
                dataInputStream.close();
            } catch (IOException e) {
                System.out.println("файла нет");
            }
        }

        System.out.println();
        OptionalDouble orephmeticMeanNumberInfile = count.stream().mapToInt(x -> x).average();
        System.out.println("Среднее орефметическо чисел в файле : " + orephmeticMeanNumberInfile.getAsDouble());

    }
}
