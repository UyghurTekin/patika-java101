import java.util.Scanner;
public class usHesaplamaRecursive {


    static int usHesaplama(int taban , int us){


        if (us == 0){
            return 1;
        }

        return taban *  usHesaplama( taban ,us-1 );
    }


    public static void main(String[] args){
        int taban, us, sunuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Digerini Girin:");
        taban = inp.nextInt();
        sunuc =taban;

        System.out.print("Us Digerini Girin:");
        us = inp.nextInt();

        System.out.println(usHesaplama(taban , us));

    }
}
