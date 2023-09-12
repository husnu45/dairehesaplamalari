
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        double piNumber = 3.14;  // Pi Sayımız
        
        double circleRadius; // Dairenin Yarı Çapı
        
        Scanner getDataFromUser = new Scanner(System.in);
        
        System.out.print("Please Enter Radius of the Circle : "); // Kullanıcıdan Alınan Dairenin Yarı Çapı
        
        circleRadius = getDataFromUser.nextDouble();
        
        double circleArea = (piNumber * circleRadius * circleRadius);  // Dairenin Alan Formülü
        
        double circumCircle = (2 * piNumber * circleRadius);  // Dairenin Çevre Formülü
        
        System.out.print("Please Enter Central Angle of the Circle : ");  // Kullanıcıdan Alınan Dairenin Merkez Açısı
        
        double centralAngle = getDataFromUser.nextDouble();
        
        double sectorOfCircle = (piNumber * (circleRadius * circleRadius) * centralAngle) / 360 ; // Daire dilim alanını bulan formül
        
        
        // Çıktılarımız
        
        System.out.println("The Area of the Circle is : " + circleArea);
        System.out.println("*******************************************");
        System.out.println("The Circumference of the Circle is : " + circumCircle);
        System.out.println("*****************************************************");
        System.out.println("The Area of a Sector of a Circle is : " + sectorOfCircle);
       
        
        
        
        
        
        
    }
    
}
