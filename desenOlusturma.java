import java.util.Scanner;

public class desenOlusturma {
    static void desenOlustur( int sayi , int i , boolean test){

        if (sayi > 0 && test){
            System.out.print(" " + sayi);
            desenOlustur(sayi - 5, i , test);


        } else if (sayi <= i ){

            System.out.print(" " + sayi);

            test = false;
            desenOlustur(sayi +5 , i , test);
        }

    }



    public static void main(String[] args) {
        int sayi, i;
        boolean test = true;

        Scanner inp = new Scanner(System.in);

        System.out.print("Bir Sayi Girin:");
        sayi = inp.nextInt();
        i = sayi;

        System.out.print("Ciktisi: ");
        desenOlustur(sayi, i , test);
    }

}
