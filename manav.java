import java.util.Scanner;

public class manav {
    public static void main(String[] args){
        double armut, elma, domates, muz, patlican, kilo, toplam;

        //kilo her veri alindiginda yenilenecek !

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo ? : ");
        kilo = inp.nextDouble();
        armut = kilo * 2.14;


        System.out.print("Elma Kac Kilo ? : ");
        kilo = inp.nextDouble();
        elma = kilo * 3.64;


        System.out.print("Domates Kac Kilo ? : ");
        kilo = inp.nextDouble();
        domates = kilo * 1.11;


        System.out.print("Muz Kac Kilo ? : ");
        kilo = inp.nextDouble();
        muz = kilo * 0.95;


        System.out.print("Patlican Kac Kilo ? : ");
        kilo = inp.nextDouble();
        patlican = kilo * 5.00;


        toplam = muz + elma + domates + muz + patlican;
        System.out.println("Toplam Tutar : " + toplam + "TL");


    }
}
