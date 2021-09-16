import java.util.Scanner;

public class showPicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        int choice=-1;
        while(choice!=4){
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    System.out.println("Draw square triangle");
                    System.out.println("* *");
                    System.out.println("*");
                case 3:
                    System.out.println("Draw iso triangle");
                case 4:
                    System.exit(0);
                default:
                    break;
            }
        }
        scanner.close();
    }
}
