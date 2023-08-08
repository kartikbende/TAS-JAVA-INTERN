import java.util.Scanner;

class multiplication {
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in) ;
       System.out.print("Enter the numbers you want to Multiply: ");
       int temp = 1 ;
       int j =1 ;
       int n = sc.nextInt() ;
      int[] mulnumbers = new int[n] ;

       if (n<=10 && n>1)
       {

         for(int i=0;i<mulnumbers.length ; i++)
         {  
            System.out.println("Enter the number " + j + ": " ) ;
            mulnumbers[i] = sc.nextInt() ;
            j++ ;
            temp = temp * mulnumbers[i] ;
         }
  
         System.out.println("The multiplication is: " + temp);

         }
         
       else 
       {
          System.out.println("The numbers need to be atleast 2 / maximum 10 for multiplication to take place.");
          System.exit(0) ;
       }
       
      if(n==2){
         System.out.println("The Multiplication table is: ");
         for (int i=1; i<=10;i++)
         {
            System.out.println(mulnumbers[0] + "*" + i + "=" + mulnumbers[0]*i);
         }
       }
   
      
        
   }
}
