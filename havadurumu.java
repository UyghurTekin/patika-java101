import java.util.Scanner;

import java.util.Scanner;
public class havadurumu {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("hava durumunu giriniz.");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("kayak yapabilirsin.");
        }else if(heat >=5 && 15 >=heat){
            System.out.println("sinemaya gidebilirsin.");
        }else if(heat >= 15 && heat <= 25){
            System.out.println("pikniye gidebilirsin.");
        }else{
            System.out.println("yuzmeye gidebilirsin.");
        }
    }
}
