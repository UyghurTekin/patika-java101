import java.util.Scanner;

public class MaxMinBulma {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayi Girin:");
        int n = inp.nextInt();

        int min = -999999999; //int alanilecek en kucuk diger.
        int max = 999999999; // ... ve e buyuk diger .

        for (int i: list) {
            if (i < n) { // 5

                if (i >= min) {
                    min = i;
                }
            }
            if (i > n) { // 5
                if (i <= max) {
                    max = i;
                }
            }
        }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maximum Değer " + max);

    }
}
