import java.util.Scanner;

public class PalindromikKelimler {
    static boolean isPalindrome(String str) {
        int j = str.length() - 1; // i  burdan cikardim for'da kullandim.

        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String kelime;
        Scanner inp = new Scanner(System.in);

        System.out.println("Test Etmek istedigniz kelimeyi giriniz!");
        kelime = inp.nextLine();

        if (isPalindrome(kelime)) {
            System.out.println("'" + kelime + "' PalindromikKelimedir !");
        }else {
            System.out.println("'" + kelime + "' PalindromikKelime Degildir ! !");
        }
    }
}
