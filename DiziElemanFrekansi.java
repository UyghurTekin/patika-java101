import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanFrekansi {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        for (int i = 0; i < dizi.length; i++) {
            int sayac = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    sayac++;
                }
            }
            
            if (!isfind(dizi, i, dizi[i])) {
                System.out.println(dizi[i] + " Sayisi " + sayac + " Kere Tekrar Etmis.");
            }
        }

    }

    // dizideki elemenin once bulunup bulunmadigini konturol eden metod
    static boolean isfind(int[] ary, int index,int item){
        for (int i = 0; i < index; i++) {
            if (ary[i] == item) {
                return true;
            }
        }
        return false;
    }
}
