package currencyconvert;
import java.util.Scanner;

public class currencyconverter {
   public static void main(String[] args) {
      int sourcecode , targetcode ;
      double amount, amt  ;
     
      Scanner sc = new Scanner(System.in) ;
      
      System.out.println("**********CURRENCY CONVERT**********");

      System.out.print("Enter the Amount you want to Convert: ");
      amount = sc.nextFloat();

      System.out.println("Source Currency ?");
      System.out.println("1-> INR (Indian Rupee)\t 2-> USD (US Dollars)\t 3->JPY (Japanese Yen)");
      System.out.print("From: ");
      sourcecode = sc.nextInt() ;

      System.out.println("Target Currency ?");
      System.out.println("1-> INR (Indian Rupee)\t 2-> USD (US Dollars)\t 3->JPY JPY (Japanese Yen)");
      System.out.print("To: ");
      targetcode = sc.nextInt();
      
      if (sourcecode==2 && targetcode==1)
      {
            amt = amount * 82.96 ; //current rate of USD to INR 08/08/23
            System.out.println("From USD to INR: " + amt);
      }
      else if (sourcecode==2 && targetcode==3)
      {
            amt = amount * 143.26 ; //current rate of USD to JPY 08/08/23
            System.out.println("From USD to JPY: " + amt);
      }
      else if (sourcecode==1 && targetcode==2)
      {
            amt = amount / 82.96 ; //current rate of USD to INR 08/08/23
            System.out.println("From USD to INR: " + amt);
      }
      else if (sourcecode==1 && targetcode== 3)
      {
            amt = amount * 1.73 ; //current rate of INR to JPY 08/08/23
            System.out.println("From USD to INR: " + amt);
      }
      else if (sourcecode==3 && targetcode==1)
      {
         amt = amount / 1.73 ; //current rate of INR to JPY 08/08/23
            System.out.println("From USD to INR: " + amt);
      }
      else if (sourcecode==3 && targetcode==2)
      {
            amt = amount / 143.26 ; //current rate of USD to JPY 08/08/23
            System.out.println("From USD to JPY: " + amt);
      }
      
      System.out.println("*****************END****************");
   }
   
}
