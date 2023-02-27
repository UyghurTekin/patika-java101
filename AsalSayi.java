public class AsalSayi {
    public static void main(String[] args) {
        boolean a;
        for (int i = 1 ; i < 100 ; i++){
            a = true; // asal sayi oldugu takdirde true kalacak .
            for (int j = 2 ; j <= (i / 2) ; j++){
                if( i % j == 0 ) {
                    a = false; // sarta yakalanirsa false olacak .
                    continue;
                }
            }
            if (a){
                System.out.println(i);
            }

        }
    }
}
