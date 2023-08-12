package Thread.ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<Integer>();
        List<ArrayList<Integer>> parts = new ArrayList<ArrayList<Integer>>();

        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> part = new ArrayList<Integer>(numbers.subList(i * 2500, (i + 1) * 2500));
            parts.add(part);
        }

        Number n1 = new Number(parts.get(0),0);
        Number n2 = new Number(parts.get(1),1);
        Number n3 = new Number(parts.get(2),2);
        Number n4 = new Number(parts.get(3),3);

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n2);
        Thread t3 = new Thread(n3);
        Thread t4 = new Thread(n4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
