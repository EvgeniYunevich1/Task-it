package Lesson16;

import java.util.ArrayList;

public class CashBox extends Thread {
    private ArrayList bag;

    CashBox(ArrayList m) throws InterruptedException {
        bag = m;
        start();
        join();
    }

    public void run() {
        System.out.println("Принят на кассу\t" + bag);
        try {
        } catch (Exception e) {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("Покупатель получил:\n" + bag);
    }

    {
        System.out.println(" пкупатель обслужен № " + getName());
    }
}

