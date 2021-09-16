import java.util.Scanner;

public class isPrime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int i =2;
        boolean check=true;
        while(i<=number/2){
            i++;
            if(number%i==0){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("this is a prime number");
        }
        else System.out.println("this is not a prime number");
        scanner.close();
    }
}
