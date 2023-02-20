import java.util.Scanner;

public class burcHesaolama {
    public static void main(String[] args){
        int ay, gun;

        Scanner inp = new Scanner(System.in);

        System.out.println("dogum ay , gunu giriniz !");
        System.out.print("Ay :");
        ay = inp.nextInt();

        System.out.print("Gun:");
        gun = inp.nextInt();

        if(ay == 1){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 22 ){
                    System.out.println("Oglak Burcu");
                }else {
                    System.out.println("Kova Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 2){
            if (gun > 0 && gun  <= 29) {
                if (gun <= 20 ){
                    System.out.println("Kova Burcu");
                }else {
                    System.out.println("Blik Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 3){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 21 ){
                    System.out.println("Balik Burcu");
                }else {
                    System.out.println("Koc Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 4){
            if (gun > 0 && gun  <= 30) {
                if (gun <= 21 ){
                    System.out.println("Koc Burcu");
                }else {
                    System.out.println("Boga Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 5){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 22 ){
                    System.out.println("Boga Burcu");
                }else {
                    System.out.println("ikizler Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 6){
            if (gun > 0 && gun  <= 30) {
                if (gun <= 23 ){
                    System.out.println("ikizler Burcu");
                }else {
                    System.out.println("Yengec Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 7){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 23 ){
                    System.out.println("Yengec Burcu");
                }else {
                    System.out.println("Aslan Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 8){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 23 ){
                    System.out.println("Aslan Burcu");
                }else {
                    System.out.println("Basak Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 9){
            if (gun > 0 && gun  <= 30) {
                if (gun <= 23 ){
                    System.out.println("Basak Burcu");
                }else {
                    System.out.println("Terazi Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 10){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 23 ){
                    System.out.println("Terazi Burcu");
                }else {
                    System.out.println("Akrep Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 11){
            if (gun > 0 && gun  <= 30) {
                if (gun <= 22 ){
                    System.out.println("akrep Burcu");
                }else {
                    System.out.println("Yay Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else if(ay == 12){
            if (gun > 0 && gun  <= 31) {
                if (gun <= 22 ){
                    System.out.println("Yay Burcu");
                }else {
                    System.out.println("Oglak Burcu");
                }
            }else{
                System.out.println("Gun Verisi Gecersiz !");
            }
        }else{
            System.out.println("Ay Verisi Gecersiz !");
        }
        
    }
}
