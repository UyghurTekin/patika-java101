import java.util.Scanner;

public class kullaniciGiris {
    public static void main(String[] args){
            String usirName , password, sifre;
            int istek;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanici Adinizi giriniz : ");
        usirName = inp.nextLine();

        System.out.print("Sifrenizi giriniz : ");
        password = inp.nextLine();

        if(usirName.equals("patika") && password.equals("123")){
            System.out.println("Basarili Giris Saglandi !");
        }
        else if(usirName.equals("patika")){

            System.out.print("Yanlis Sifre Girdiniz ! \n Sifre Sifirlamak Istermisiniz ? \n 1.istiyorum . \n 2.istemiyorum \n Sectiginiz sayiyi Giriniz:");
            istek = inp.nextInt();
            inp.nextLine();// \n ni sifirlamak icin .

            if (istek == 1){

                System.out.print("Yeni sifrenizi Giriniz: ");
                sifre = inp.nextLine();

                if (!password.equals(sifre) && !sifre.equals("123")){

                    System.out.println("sifre basari ile Olusturuldu !");

                }else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");
                    // burasi donguye sokulmali .
                }
            }else{

                System.out.println("iyi Gunler !"); // istemiyorsa yapicak bisey yok .
            }


        }else{
            System.out.println("Kullanic adi yada Sifre Yanlis !");
        }
    }
}
