import java.util.Scanner;
class Task4{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int res = handshake(n);
        System.out.println("The result will be :"+res);


    }
    public static int handshake(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return handshake(n - 1) + (n - 1);
        }
    }
}