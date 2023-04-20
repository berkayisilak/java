import java.util.Scanner;

public class Horoscope {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int month, day;

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        if((month==3 && day>=21) || (month==4 && day <=20)){
            System.out.print("Burcunuz koç.");
        }
        else if((month==4 && day>=21) || (month==5 && day<=21)){
            System.out.print("Burcunuz boğa.");
        }
        else if((month==5 && day>=22) || (month==6 && day<=22)){
            System.out.print("Burcunuz ikizler.");
        }
        else if((month==6 && day>=23) || (month==7 && day<=22)){
            System.out.print("Burcunuz yengeç.");
        }
        else if((month==7 && day>=23) || (month==8 && day<=22)){
            System.out.print("Burcunuz aslan.");
        }
        else if((month==8 && day>=23) || (month==9 && day<=22)){
            System.out.print("Burcunuz başak.");
        }
        else if((month==9 && day>=23) || (month==10 && day<=22)){
            System.out.print("Burcunuz terazi.");
        }
        else if((month==11 && day>=22) || (month==12 && day<=21)){
            System.out.print("Burcunuz yay.");
        }
        else if((month==12 && day>=22) || (month==1 && day<=21)){
            System.out.print("Burcunuz oğlak.");
        }
        else if((month==1 && day>=22) || (month==2 && day<=19)){
            System.out.print("Burcunuz kova.");
        }
        else if((month==2 && day>=20) || (month==3 && day<=20)){
            System.out.print("Burcunuz balık.");
        }

        else{
            System.out.print("Hatalı giriş yaptınız");
        }
    }
}
