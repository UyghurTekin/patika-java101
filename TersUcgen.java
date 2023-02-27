import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        int sayi;

        Scanner inp = new Scanner(System.in);
        System.out.print("Satir icin TEK sayi Girin:");
        sayi = inp.nextInt();

        for(int i = sayi; i>=0 ; i--){
            for(int j = 0; j<=(sayi-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
