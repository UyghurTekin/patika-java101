import java.util.Scanner;

public class vucutKitleIndeksiHesaplama {
    public static void main(String[] args) {
        double boy, kilo, kIndex;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = inp.nextDouble();

        kIndex =  kilo / ( boy * boy );
        System.out.println("Vücut Kitle İndeksiniz :" + kIndex);
    }
}
