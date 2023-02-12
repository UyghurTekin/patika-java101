import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args){
        int san1, san2, select;

        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayiyi Girin : ");
        san1 = inp.nextInt();

        System.out.print("2.Sayiyi Girin : ");
        san2 = inp.nextInt();

        System.out.print("Yapmak istediginiz islem Secin: \n 1.Arti : 1 \n 2.eksi : 2 \n 3.Carpi : 3 \n 4.Bolu : 4 \n Sectiginizi Giriniz " );

        select = inp.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam :" + (san1 + san2) );
                break;
            case 2:
                System.out.println("Toplam :" + (san1 - san2) );
                break;
            case 3:
                System.out.println("Toplam :" + (san1 * san2) );
                break;
            case 4:
                System.out.println("Toplam :" + (san1 / san2) );
                break;
            default:
                System.out.println("yanlis secim yaptiniz !");
        }
    }
}
