import java.util.Scanner;

public class ucakFiyat {
    public static void main(String[] args) {

        double Distance , age , tripType , perDistance = 0.10 , total=0 , indirim=0;
        boolean B =true ;
        Scanner input = new Scanner(System.in);

        System.out.print("mesafeyi giriniz: ");
        Distance = input.nextDouble();
        
        System.out.print("yasinizi giriniz: ");
        age = input.nextDouble();

        System.out.print("yolculuk tipini giriniz: (tek yon=1 , donus=2)");
        tripType = input.nextDouble();

        if(Distance > 0){
            total = Distance * perDistance ;
            indirim = total;
        }else{
            B = false;
        }

        if(age > 0){
            if(age < 12){
                indirim =indirim-(indirim*0.50);
                
            }else if(age>=12 && age<=24){
                indirim =indirim-(indirim*0.10);
            }else if(age > 65){
                indirim =indirim-(indirim*0.30);
            }
        }else{
            B = false;
        }

        if(tripType ==1 || tripType == 2){
           if(tripType == 2){
            indirim =indirim-(indirim*0.20);
           }
        }else{
            B = false;
        }
        
        if(B){
            System.out.print("biletin toplam fiyati:"+ total + "\nindirimli fiyat:"+ indirim);
        }else{
            System.out.println("yanlis veri girdiniz."); 
        }
      
    }
}
