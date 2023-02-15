import java.util.Scanner;

public class kuvetYazdirma {
    public static void main(String[] args){
        int sayi, kuvet4 , kuvet5;

        System.out.print("Bir Sayi Giriniz: ");
        Scanner inp = new Scanner(System.in);
        sayi = inp.nextInt();

        for (int i = 4, j = 5 ;i < sayi && j < sayi ; i *= 4, j *= 5){

            System.out.println( i + " : " + j );
        }
    }
}
