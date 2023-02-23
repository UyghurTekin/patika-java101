import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        int sayi;
        double toplam  = 0 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi Girin:");
        sayi = inp.nextInt();

        for(double i = 1; i <= sayi ; i++){
            toplam += 1 / i;
        }

        System.out.println("Harmonik Sayi: " + toplam);
    }
}
