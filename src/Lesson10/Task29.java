package Lesson10;

import java.util.*;

public class Task29 {
    //Имеется текст. Составить частотный словарь для него.
    public static void main(String[] args) {
        String text = "Предвижу всё: вас оскорбит " +
                "Печальной тайны объясненье. " +
                "Какое горькое презренье " +
                "Ваш гордый взгляд изобразит! " +
                "Чего хочу? с какою целью " +
                "Открою душу вам свою?";
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer transformText = new StringTokenizer(text, " <>-,.:;!?");
        while (transformText.hasMoreTokens()) {
            String words = transformText.nextToken();
            Integer numberOfRepeatedWords = hashMap.get(words);
            if (numberOfRepeatedWords != null)
                hashMap.put(words, numberOfRepeatedWords + 1);
            else
                hashMap.put(words, 1);
        }

        for (Map.Entry<String, Integer> entry : hashMap.entrySet())
            System.out.print(entry.getKey() + " - " + entry.getValue() + ";  ");
    }
}