import java.util.Arrays;

public class TekrarSayiBulma {
    public static void main(String[] args) {
        int[] sayi = {2, 8, 9, 5, 8, 5, 2, 4, 1, 4};
        int[] cift = new int[sayi.length];
        int start = 0;
        
        for (int i = 0; i < sayi.length; i++) {
            for (int j = 0; j < sayi.length; j++) {
                if (i != j && (sayi[i] == sayi[j])) {
                    if (sayi[j] % 2 == 0 && !isfind(cift, sayi[j])) {
                        cift[start++] = sayi[j];
                    }

                }
            }
        }
        for (int i : cift) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }

    static boolean isfind(int[] ary, int i){
        for (int dizi: ary) {
            if (dizi == i) {
                return true;
            }
        }
        return false;
    }
}
