package Lesson15;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//прочитать файл  с названиями книг, находящиеся в папке books (корень проекта), десериализировать в список объектов
// книг, а затем сгруппировать книги по автору.
public class
TaskBooks {
    private static String adres = "./book.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        write(adres);
        readAndAction(adres);
    }

    public static void write(String adres) throws IOException {
        List<Books> books = Arrays.asList(
                new Books("Тонкое искусство пофигизма", "Марк Мэнсон"),
                new Books("Подсознание может все!", "Джон Кехо"),
                new Books("Гарри Поттер ", "Джоан Роулинг"),
                new Books("Тонкое искусство пофигизма", "Марк Мэнсон"),
                new Books("Гордость и предубеждение", "Джейн Остин"),
                new Books("Гарри Поттер ", "Джоан Роулинг"),
                new Books("Гарри Поттер ", "Джоан Роулинг"),
                new Books("Гордость и предубеждение", "Джейн Остин"),
                new Books("Гордость и предубеждение", "Джейн Остин"));
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(adres));
        objectOutputStream.writeObject(books);
        objectOutputStream.close();
    }

    public static void readAndAction(String adres) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(adres));
        List<Books> allbooks;
        allbooks = ((List<Books>) objectInputStream.readObject());
        objectInputStream.close();
        allbooks.stream().collect(Collectors.groupingBy(Books::getAvtor)).entrySet().forEach(System.out::println);
    }


    static class Books implements Serializable {
        private String name;
        private String avtor;

        public Books(String name, String avtor) {
            this.name = name;
            this.avtor = avtor;
        }

        public String getAvtor() {
            return avtor;
        }

        @Override
        public String toString() {
            return "Books{" +
                    "name='" + name + '\'' +
                    ", avtor='" + avtor + '\'' +
                    '}';
        }
    }
}

