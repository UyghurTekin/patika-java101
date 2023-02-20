import java.util.Scanner;

public class sayisiralama {
    public static void main(String[] args) {
        int a , b , c ;
        Scanner input = new Scanner(System.in);

        System.out.print("bir tam sayi kiriniz");
        a = input.nextInt();
        System.out.print("bir tam sayi kiriniz");
        b = input.nextInt();
        System.out.print("bir tam sayi kiriniz");
        c = input.nextInt();

        if(a < b && a < c){
            if(b < c){
                System.out.println("a < b < c");
            }else if(b > c){
                System.out.println("a < c < b");
            }else{
                System.out.println("a<b=c");
            }
            
        }else if(b < a && b < c){
            if(a < c){
                System.out.println("b < a < c");
            }else if(a > c){
                System.out.println("b < c < a ");
            }else{
                System.out.println("b<a=c");
            }
        }else if(c < a && c < b){
            if(b < a){
                System.out.println("c < b < a");
            }else if(b > a){
                System.out.println("c < a <b");
            }else{
                System.out.println("c<a=b");
            }
        }else{
            System.out.println("eyni sayiyi girmeyiniz.");
        }

    }
}
