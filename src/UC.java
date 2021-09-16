import java.util.Scanner;


public class UC {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("input a");
         int a = scanner.nextInt();
         System.out.println("input b");
         int b = scanner.nextInt();
         for( int i=a;i>0;i--){
            if(a%i==0&&b%i==0){
                if(i!=1){
                    System.out.println("max is: "+i);
                }
                else System.out.println("there is no greatest common factor");
                break;
            }
         }
         scanner.close();
     }   
}
