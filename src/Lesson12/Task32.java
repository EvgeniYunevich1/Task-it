package Lesson12;

import java.io.*;
import java.util.*;

//Записать в двоичный файл 20 случайных чисел.Прочитать записанный файл, распечатать  и их среднее арифметическое.
public class Task32 {
    public static void main(String[] args) throws IOException  {

        DataOutputStream text = null;
        try {
            text= new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Text.data")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        for (int i=0;i<20;i++){
            text.writeInt(((int) (Math.random() * 10 + 1)));
        }
        text.close();
        ArrayList<Integer> count= new ArrayList<>();
       DataInputStream dataInputStream=null;
        try {
            dataInputStream= new DataInputStream(new BufferedInputStream(new FileInputStream("Text.data")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        int res =dataInputStream.readInt();
        System.out.println("Числа в файл");
        while (true){
            System.out.print(res+" ");
            count.add(res);
            try {
                res =dataInputStream.readInt();
            }catch (EOFException e){
                break;
            }
        }
        if(dataInputStream!=null){
            dataInputStream.close();
        }
        System.out.println();
       OptionalDouble orephmeticMeanNumberInfile=count.stream().mapToInt(x->x).average();
        System.out.println("Среднее орефметическо чисел в файле : "+orephmeticMeanNumberInfile.getAsDouble());
    }
}
