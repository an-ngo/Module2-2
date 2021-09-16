public class primeNumber {
    public static void main(String[] args) {
        System.out.println("2");
        System.out.println("3");
        int n=5;
        boolean check=true;
        while(n<100){
            for(int i=2;i<n/2;i++){
                if(n%i==0){
                    check = false;
                }
            }
            if(check){
                System.out.println(n);

            }
            n++;
            check = true;
            
        }
    }
}
