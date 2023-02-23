import java.util.Scanner;

public class basamakToplam {
    public static void main(String[] args) {
    int sayi , toplam  = 0 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi Girin:");
        sayi = inp.nextInt();

        while (sayi != 0){
            toplam += (sayi % 10) ;
            sayi /= 10 ;
        }

        System.out.println("Toplam: " + toplam);
    }
}
