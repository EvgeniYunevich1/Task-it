package Lesson14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Task30 {
    final static String text = "Предвижу всё: вас оскорбит\n" +
            "Печальной тайны объясненье.\n" +
            "Какое горькое презренье\n" +
            "Ваш гордый взгляд изобразит!\n" +
            "Чего хочу? с какою целью\n" +
            "Открою душу вам свою ?";

    public static void main(String[] args) {
        createNewFail("Text.txt");
        opereshen();
    }

    private static void createNewFail(String fileName) {
        try (FileWriter writer = new FileWriter("fileName")) {
            writer.write(text);

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static int counts() {//Считаем количество слов в тексте
        int count = 0;
        File file = new File("fileName");
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                scanner.next();
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        scanner.close();
        System.out.println("Количество слов в тексте - " + count);
        return count;
    }

    public static void readFileAsString(String fileName) {//Считаем количество знаков припинания в тексте
        String data = "";
        int ad = 0;
        String m = "!,?.:-";
        try {
            data = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
        for (int i = 0; i < data.length(); i++) {
            for (int b = 0; b < m.length(); b++) {
                if (data.charAt(i) == m.charAt(b)) {
                    ad++;
                }
            }
        }
        System.out.println("Количество знаков припинания - " + ad);

    }

    private static void opereshen() {
        readFileAsString("fileName");
        counts();

    }


}

