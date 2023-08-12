package Thread.ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Number implements Runnable{
    private int sleepTime;
    private List<Integer> list;
    static private List<Integer> oddList = new ArrayList<>();
    static private List<Integer> evenList = new ArrayList<>();

    public Number(List<Integer> list, int sleepTime) {
        this.list = list;
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepTime);
            increment();
            if (oddList.size() > 3751) {
                System.out.println(getEvenList());
                System.out.println(evenList.size());
                System.out.println(getOddList());
                System.out.println(oddList.size());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private synchronized void increment() {
        for (Integer arr: this.list) {
            if (arr % 2 == 0) {
                this.evenList.add(arr);
            } else {
                this.oddList.add(arr);
            }
        }
    }

    public static List<Integer> getOddList() {
        return oddList;
    }

    public static List<Integer> getEvenList() {
        return evenList;
    }
}
