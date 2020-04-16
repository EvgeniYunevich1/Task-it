package Lesson17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    //Провалидировать адрес электронного  кошелька, пример начало всегда с букв 'E' 'D' 'R' после буквы следает 12 чисел,
// возможен ввод с пробелами это не должно влять на нашу проверку
    private static final String zipPattern = "^\\s*[EDR]\\s*([0-9]\\s*){12}\\s*$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(zipPattern);
        Matcher matcher = pattern.matcher(" D                        1 2 3 456 78 90 12 ");
        System.out.println(matcher.matches());
    }
}
