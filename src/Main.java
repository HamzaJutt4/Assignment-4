import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the number ");
        Scanner input  = new Scanner(System.in);
        int num = input.nextInt();
       int ans =  factoral(num);
        System.out.println("factorial will be :"+ans);
    }
    public  static int factoral(int n) {
        if(n==0 || n==1){
            return 1;
        }
        else
            return factoral(n-1)*n;

    }


}