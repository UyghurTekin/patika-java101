import java.util.Scanner;

public class daireDilimAlaniHesaplama {
    public static void main(String[] args){
        double r, a, p, alan;
        p = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari Capini girin: ");
        r = inp.nextDouble();

        System.out.print("Dairenin Merkez açısının ölçüsünu Girin:");
        a =inp.nextDouble();

        alan = (p * (r*r) * a) / 360;

        System.out.println("Dairenin Diliminin alani: " + alan);

    }
}
