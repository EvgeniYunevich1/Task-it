package Lesson14;

import java.io.File;


public class Task33 {
    private static String documentСase = "D:/GamesMailRu";

    public static void main(String[] args) {
        printCatalog(documentСase);
        printFail(documentСase);
        printSecretFile(documentСase);
        printSecretPacked(documentСase);
    }

    public static void printCatalog(String packed) {
        File file = new File(packed);
        System.out.println("Папки в каталоге : " + packed);
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isDirectory()) {
                    System.out.print(item.getName() + "  \t ");
                }
            }

        }
        System.out.println();
    }

    public static void printFail(String packed) {
        File file = new File(packed);
        System.out.println("Файлы в каталоге : " + packed);
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isFile()) {
                    System.out.print(item.getName() + "\t ");
                }
            }
        } else {
            System.out.println("Каталогов нет");

        }
        System.out.println();
    }

    private static void printSecretFile(String packed) {
        File file = new File(packed);
        System.out.println("Скрытые файлы  : " + packed);
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isHidden()) {
                    if (item.isFile()) {
                        System.out.print(item.getName() + "\t ");
                    }
                }
            }

        } else {
            System.out.println("Каталогов нет");
        }
        System.out.println();
    }

    private static void printSecretPacked(String packed) {
        File file = new File(packed);
        System.out.println("Скрытые папки в каталоге : " + packed);
        if (file.isDirectory()) {
            for (File item : file.listFiles()) {
                if (item.isHidden()) {
                    if (item.isDirectory()) {
                        System.out.print(item.getName() + "\t ");
                    }
                }

            }

        }
    }

}


