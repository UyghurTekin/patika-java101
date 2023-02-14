import java.util.Scanner;

public class tamBolunenSayi {
    public static void main(String[] args){
        int sayi, toplam = 0 , j =0, ortalama;

        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan program !");
        System.out.print("Bir SayiGirin: ");

        Scanner inp = new Scanner(System.in);
        sayi = inp.nextInt();

        for (int i = 0 ; i<= sayi ; i++){
            if( i % 3 == 0 && i % 4 == 0){
                toplam += i;
                j++;
            }
        }
        ortalama = toplam/j;

        System.out.print("Ortalama: " + ortalama);

    }
}
