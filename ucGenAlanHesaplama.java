import java.util.Scanner;
public class ucGenAlanHesaplama {
        public static void main(String[] args) {

            int a,b,c;
            double d,cevre,alan;

            Scanner inp = new Scanner(System.in);
            System.out.print("1.Kenarı girin : ");
            a= inp.nextInt();

            System.out.print("2.Kenarı girim : ");
            b= inp.nextInt();

            System.out.print("3.Kenarı girin : ");
            c= inp.nextInt();

            d=(a+b+c)/2;
            cevre=2*d;
            alan =Math.sqrt(d*(d-a)*(d-b)*(d-c));

            System.out.println("Üçgenin çevresi : " +cevre);
            System.out.println("Üçgenin alanı : "+alan);
        }
    }
