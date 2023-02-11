import java.util.Scanner;
public class ortalama {
    public static void main(String[] args){
        // Değişkenler.
        int mat, fizik, kimya, turukce, tarih, toplam, ortalama;

        // scanner class.
        Scanner inp = new Scanner(System.in);

        // kullanici veri alis.

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextInt();

        System.out.print("Turukce Notunuzu Giriniz : ");
        turukce = inp.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = inp.nextInt();

        // ortalama işlemi.

        toplam = mat + fizik + kimya + turukce + tarih ;
        ortalama = toplam/5;

         if(ortalama >= 60){
             System.out.print("Tebrikler, Başariyle Sinif Geçtiniz ! Not Ortalamaniz: " + ortalama);
        }else{
             System.out.print("Üzgünüz, Sinifta Kaldiniz !Not Ortalamaniz: " + ortalama);
        }

    }
}
