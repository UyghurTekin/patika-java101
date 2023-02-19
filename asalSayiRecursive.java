import java.util.Scanner;

public class asalSayiRecursive {

    static Boolean asalSayiMi( int sayi, int test){

        if (test < 2){ // test sartlara yakalanmadan 1 kadar azala bilse asal sayidir
            return true;
        } else if (sayi == 2 ) {
            return true;
        } else if (sayi % test == 0 ) {
            return false;
        }

        return asalSayiMi( sayi,test-1 );
    }



    public static void main(String[] args){
        int sayi, test;

            Scanner inp = new Scanner(System.in);

            System.out.print("Bir Sayi Girin:");
            sayi = inp.nextInt();
            test = sayi/2;

            if (asalSayiMi(sayi, test)){
                System.out.println( sayi + " Bir Asal Sayidir !");
            }else {
                System.out.println( sayi + " Bir Asal Sayi Degildir !");
            }
    }
}
