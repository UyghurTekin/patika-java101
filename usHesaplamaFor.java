import java.util.Scanner;

public class usHesaplamaFor {

    public static void main(String[] args){
        int taban, us, sunuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Digerini Girin:");
        taban = inp.nextInt();
        sunuc =taban;

        System.out.print("Us Digerini Girin:");
        us = inp.nextInt();

        for (int i = 1 ; i < us ; i++){
            sunuc = sunuc * taban;
        }
        System.out.println("Sunuc: " + sunuc);

    }
}
