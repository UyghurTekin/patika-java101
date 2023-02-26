import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1, ekok = 1, i, j = 1;
        Scanner inp = new Scanner(System.in);

        System.out.print("N1 Sayisini Girin:");
        n1 = inp.nextInt();

        System.out.print("N2 Sayisini Girin:");
        n2 = inp.nextInt();

        i = n1;

        while (i > 0){
            if (n1 % i ==0 && n2 % i == 0){
                ebob = i; break;
            }
            i--;
        }
        System.out.println("EBOB : " + ebob);

        while (j < (n1 * n2)) {
            if (j % n1 ==0 && j % n2 == 0) {
                ekok = j; break;
            }
            j++;
        }
        System.out.println("EKOK1 : " + ekok);

        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK2 : " + ekok);
    }
}
