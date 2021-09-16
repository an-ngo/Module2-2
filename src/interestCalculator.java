import java.util.Scanner;

public class interestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input amount of money");
        double money = scanner.nextDouble();
        System.out.println("input amount of month");
        int month = scanner.nextInt();
        System.out.println("input amount of interestRate");
        double interestRate = scanner.nextDouble();
        double total =money;
        for(int i=0;i<month;i++){
            total=total*(1+interestRate/100);
        }
        System.out.println("total is: "+total);
        scanner.close();
    }
}
