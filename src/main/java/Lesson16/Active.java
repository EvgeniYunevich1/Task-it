package Lesson16;

import java.util.ArrayList;
import java.util.Collections;
// Одна касса три покупателя.
public class Active {
    public static void main(String args[]) throws InterruptedException {
        ArrayList arrayList = new ArrayList(Collections.singleton("батон, хлеб , печенье "));
        ArrayList arrayList1 = new ArrayList(Collections.singleton("батон, молоко , печенье"));
        ArrayList arrayList2 = new ArrayList(Collections.singleton("чипсы, хлеб , печенье"));

        CashBox S1 = new CashBox(arrayList);
        CashBox S2 = new CashBox(arrayList1);
        CashBox s3 = new CashBox(arrayList2);


    }
}
