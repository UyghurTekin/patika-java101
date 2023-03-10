import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        int n, a; // a => sort isleminde yer degistirmek icin .
        Scanner inp = new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Girin:");
        n = inp.nextInt();

        int[] dizi = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". Elemani: ");
            dizi[i] = inp.nextInt();
        }
        System.out.println("Asil ddizi: " + Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] <= dizi[j]) {
                    a = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = a;
                }
            }
        }
        System.out.println("Sortlanmis Hali: " + Arrays.toString(dizi));
        }
}
