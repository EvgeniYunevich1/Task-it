package Lesson16;

public class CashDesk extends Thread {
    private String name;

    public CashDesk(String name) {
        this.name = name;
        this.start();
    }

    public void run() {
        int count = 0;
        for (int i = 1; i < 5; i++) {
            count = i;
            System.out.println("Касса  № " + name + " Покупатель № " + count
                    + " купил " + Produckt.listproduckt());
            System.out.println("Покупатель № " + count + "  Обслужен на кассе № " + name);
            try {
                this.join(1000);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }

    }

}


