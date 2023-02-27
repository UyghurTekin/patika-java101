import java.util.Scanner;
public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi, toplam = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayiyi Girin:");
        sayi = inp.nextInt();

        for (int i = 1 ; i <= sayi / 2 ; i++){

            if (sayi % i == 0){
                toplam += i;
            }
        }

        if (toplam == sayi){
            System.out.println(sayi + " Mukemmel Sayidir !");

        }else {
            System.out.println(sayi + " Mukemmel Sayi Degildir !");
        }

    }
}
