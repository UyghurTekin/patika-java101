import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args){

       double tutar,kdvTutari, kdvliTutar, kdvOrani1, kdvOrani2;

       kdvOrani1 = 0.18; kdvOrani2 = 0.08;


       System.out.print("Tutarinizi Giriniz : ");

       Scanner inp = new Scanner(System.in);
       tutar = inp.nextDouble();

       if (tutar <= 0){

           System.out.println("Gecersiz Tutar !");

       } else if (tutar <= 1000) {

        kdvTutari = tutar * kdvOrani1;
        kdvliTutar = tutar + kdvTutari;

           System.out.println("tutariniz: " + tutar);
           System.out.println("KDV orani: " + kdvOrani1);
           System.out.println("KDV Dahil Toplam Tutar: " + kdvliTutar);

       } else if(tutar > 1000){

           kdvTutari = tutar * kdvOrani2;
           kdvliTutar = tutar + kdvTutari;

           System.out.println("tutariniz: " + tutar);
           System.out.println("KDV orani: " +kdvOrani2);
           System.out.println("KDV Dahil Toplam Tutar: " + kdvliTutar);
       }

    }
}
