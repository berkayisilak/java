package Collection.FixtureBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> thisWeekFix = new ArrayList<>();
        ArrayList<String> stashFix = new ArrayList<>();
        ArrayList<Integer> randCheck = new ArrayList<>();
        Random rand = new Random();

        List<String> tSet = new ArrayList<>();
        int n = 0;
        try {
            System.out.println("Enter number of teams: ");
            n = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter of number!!!");
        }

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter teams: ");
                String a = scan.next();
                tSet.add(a.toUpperCase());
            }

            if (n % 2 != 0) {
                tSet.add("Bay");
            }
        } catch (Exception e) {
            System.out.println("You entered wrong value!!!");
        }

        if (tSet.size() != 0) {
            System.out.println("The teams");
            for (String b : tSet) {
                System.out.println(b);
            }
            System.out.println("----------------------------------");
        } else {
            System.out.println("Enter the number of teams to play");
        }

        try {
            int round = 1;
            while (round <= 2 * (tSet.size() - 1)) {
                System.out.println("Round: " + round);
                for (int j = 0; j < tSet.size() / 2; j++) {
                    int home = rand.nextInt(tSet.size());
                    while (randCheck.contains(home)) {
                        home = rand.nextInt(tSet.size());
                    }

                    int away = rand.nextInt(tSet.size());
                    while (randCheck.contains(away)) {
                        away = rand.nextInt(tSet.size());
                    }

                    String fixComb = home + " " + away;

                    while (stashFix.contains(fixComb)) {
                        home = rand.nextInt(tSet.size());

                        while (randCheck.contains(home)) {
                            home = rand.nextInt(tSet.size());
                        }

                        away = rand.nextInt(tSet.size());

                        while (away == home || randCheck.contains(away)) {
                            away = rand.nextInt(tSet.size());
                        }
                        fixComb = home + "" + away;
                    }
                    randCheck.add(home);
                    randCheck.add(away);
                    stashFix.add(fixComb);
                    String match = tSet.get(home) + " VS " + tSet.get(away);
                    thisWeekFix.add(match);
                }

                for (Object c : thisWeekFix) {
                    System.out.println(c);
                }
                System.out.println("----------------------------------");
                randCheck.clear();
                thisWeekFix.clear();
                round++;
            }
        } catch (Exception e) {
            System.out.println("Error received");
        }
        System.out.println("End");
    }
}
