import java.util.Scanner;
public class MinMaxNumber {
    public static void main(String[] args) {
        int min, max, n, sayi;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kac Tane Sayi Gireceksini:");
        n = inp.nextInt();

        System.out.print("1.Sayiyi Girin:");
        min = inp.nextInt();
        max = min;

        for (int i = 1 ; i < n; i++){

            System.out.print((i + 1) + ".Sayiyi Girin:");
            sayi = inp.nextInt();

            if (min >sayi){ min = sayi; }

            if (max < sayi){ max = sayi; }
        }

        System.out.println("En Kucuk Sayi:" + min);
        System.out.println("En Buyuk Sayi:" + max);
        
    }
}
