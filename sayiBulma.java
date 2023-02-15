import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args){
        int sayi , toplam =0 ;

        Scanner inp = new Scanner(System.in);

        do {

            System.out.print("Bir Sayi Girin: ");
            sayi = inp.nextInt();

            if (sayi%2 == 0 && sayi%4 == 0){
                toplam += sayi;
            }

        }while(sayi != 7 ); // girilmesi istenen sayi 8.

        System.out.println("Girdiginiz saylilardan 2 ve 4 de tam bolunen Sayilarin toplami : " + toplam);
    }
}
