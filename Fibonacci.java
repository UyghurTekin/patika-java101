import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0, b = 1, c, n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Eleman Sayisini Giriniz :");
        n = inp.nextInt();

        for(int i = 0 ; i < n ; i++){
            c=a+b;
            System.out.println((i + 1) + ". " + a + "+" + b + "=" + c);
            a=b;
            b=c;
        }
    }
    //0 1 1 2 3 5 8 13 21 34

}
