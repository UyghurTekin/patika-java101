import java.util.Scanner;

public class elmasCizdirma {
    public static void main(String[] args) {
        int sayi, t , x = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Satir icin TEK sayi Girin:");
        sayi = inp.nextInt();

        for(int i = 0 ; i < sayi  ; i++){
            t = sayi / 2;
            if (i <= (sayi / 2)){

                for (int j = 0 ; j < (t - i) ; j++ ) {
                    System.out.print(" ");
                }
                for (int k = 0 ; k < (2 * i + 1) ; k++ ) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0 ; j < (i - t) ; j++ ) {
                    System.out.print(" ");
                }
                x += 2; // yildizin ikiser ikiser azalmasini saglar
                for (int k = 0 ; k < (sayi - x ) ; k++ ) {
                    System.out.print("*");
                }
            }

            System.out.println(" ");
        }
    }

}
