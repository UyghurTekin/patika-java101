public class palindromSayi {

    static boolean isPalindrom(int num){

        int sayi = num, tersiSayi = 0, sonSayi;

        while (sayi != 0){

            sonSayi = sayi % 10;

            tersiSayi = (tersiSayi * 10) + sonSayi;

            sayi /= 10;

        }

        return num == tersiSayi ? true : false;
    }

    public static void main(String[] args){
        int sayi  = 101;
        if(isPalindrom(sayi)){
            System.out.println(sayi + " Sayisi Palindrom Sayidir !");
        }else{
            System.out.println(sayi + " Sayisi Palindrom Sayi Degil !");
        }
    }
}
