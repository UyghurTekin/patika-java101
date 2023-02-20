import java.util.Scanner;

public class mocel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
       System.out.print("dogum yilini giriniz:");
       yil = input.nextInt();
       yil %= 12;
       yil++;
       System.out.println(yil);
       switch(yil){
        case 1:
        System.out.println("Çin Zodyağı Burcunuz : maymun");
        break;
        case 2:
        System.out.println("Çin Zodyağı Burcunuz : horoz");
        break;        
        case 3:
        System.out.println("Çin Zodyağı Burcunuz : kopek");
        break;        
        case 4:
        System.out.println("Çin Zodyağı Burcunuz : domuz");
        break;        
        case 5:
        System.out.println("Çin Zodyağı Burcunuz : fare");
        break;        
        case 6:
        System.out.println("Çin Zodyağı Burcunuz : okuz");
        break;        
        case 7:
        System.out.println("Çin Zodyağı Burcunuz : kaplan");
        break;        
        case 8:
        System.out.println("Çin Zodyağı Burcunuz : tavsan");
        break;        
        case 9:
        System.out.println("Çin Zodyağı Burcunuz : ejderha");
        break;        
        case 10:
        System.out.println("Çin Zodyağı Burcunuz : yilan");
        break;        
        case 11:
        System.out.println("Çin Zodyağı Burcunuz : at");
        break;        
        case 12:
        System.out.println("Çin Zodyağı Burcunuz : keci");
        break;
        default:
        System.out.println("yanlis girdiniz.");       
        
        
       }
    }
}
