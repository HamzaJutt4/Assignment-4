import java.util.Scanner;

public class Task5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number os x : ");
        int n = sc.nextInt();
        Scanner se1= new Scanner(System.in);
        System.out.println("Enter  the number of y :");
        int n1 = se1.nextInt();
        System.out.println("GCD of "+n+" and "+n1+" is :"+GCD(n,n1) );



    }

    public static int GCD(int a, int b){
        if(b==0){
            return a;

        }
        return GCD(b,a%b);
    }
}