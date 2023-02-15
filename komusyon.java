import java.util.Scanner;
public class komusyon {
    public static void main(String[] args) {

        double Factorial1 = 1, Factorial2 = 1, firstMinusSecondFactorial = 1;
        double komusyon;

        Scanner input = new Scanner(System.in);

        System.out.println("Kombinasyonu hesaplamak için iki sayı girin !");

        System.out.print("1.Sayi n: ");
        double nNumber = input.nextDouble();
        System.out.print("2.Sayi r");
        double rNumber = input.nextDouble();


        for( int i = 1; i <= nNumber; i++){
            Factorial1 *= i;
        }

        for( int i = 1; i <= rNumber; i++){
            Factorial2 *= i;
        }

        for (int i = 1; i <=(nNumber-rNumber) ; i++) {
            firstMinusSecondFactorial=firstMinusSecondFactorial*i;
        }

        komusyon = Factorial1 / (Factorial2 * firstMinusSecondFactorial);

        System.out.println("Komusyon: " + komusyon);
    }
}