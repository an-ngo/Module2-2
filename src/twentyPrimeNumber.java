import java.util.Scanner;

public class twentyPrimeNumber {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int number = 20;
        //int count =0;
        System.out.println("2");
        System.out.println("3");
        int n=5;
        boolean check=true;
        while(number>0){
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    check = false;
                }
            }
            if(check){
                System.out.println(n);
                number-=1;
            }
            n++;
            check = true;
            
        }
    }
}
