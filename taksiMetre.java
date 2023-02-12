import java.util.Scanner;

public class taksiMetre {
    public static void main(String[] args){
        double mesafe, toplam, kmUcret, baslangic;
        kmUcret = 2.2;
        baslangic = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Katettiğniz Mesafeyi Giriniz: ");
        mesafe = inp.nextDouble();

        toplam = baslangic + (mesafe * kmUcret);

        toplam = (toplam > 20) ? toplam : 20 ;

        System.out.println("Odenecek tutar:" + toplam + "TL");

    }
}
