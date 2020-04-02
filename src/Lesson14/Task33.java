package Lesson14;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//Вывести список фалов и каталогов выбранного каталога на диске.Файлы и каталоги должны быть распечатаны отдельно.
public class Task33 {
    private static String documentСase = "D:/Новая папка";

    public static void main(String[] args) {
        printCatalo(documentСase);
        printFail(documentСase);
    }

    public static void printCatalo(String packed)  {
        System.out.println("Все каталоги "+ packed);
        try {
            Files.walk(Paths.get(packed))
                    .filter(Files::isDirectory)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Каталогов нет");
    }
        System.out.println();
    }

    public static void printFail(String packed) {

        System.out.println("Файлы в каталоге : " + packed);
        try {
            Files.walk(Paths.get(packed))
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Каталогов нет");
        }
        System.out.println();

    }

        }


