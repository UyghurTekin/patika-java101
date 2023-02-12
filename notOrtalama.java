import java.util.Scanner;
public class notOrtalama {

        public static void main(String[] args){
            // Değişkenler.
            int mat, fizik, kimya, turukce, tarih, toplam = 0, ortalama, test = 0;

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

            if (mat >= 0 && mat <= 100 ){ toplam = mat; test++;}
            if (fizik >= 0 && fizik <= 100 ){ toplam += fizik; test++;}
            if (kimya >= 0 && kimya <= 100 ){ toplam += kimya; test++;}
            if (turukce >= 0 && turukce <= 100 ){ toplam += turukce; test++;}
            if (tarih > 0 && tarih < 100 ){ toplam += tarih; test++;}

            System.out.print("test" + test);

            ortalama = toplam / test;

            if(ortalama >= 60){
                System.out.print("Tebrikler, Başariyle Sinif Geçtiniz ! Not Ortalamaniz: " + ortalama);
            }else{
                System.out.print("Üzgünüz, Sinifta Kaldiniz !Not Ortalamaniz: " + ortalama);
            }
        }
}


