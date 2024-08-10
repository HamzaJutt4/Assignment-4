import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the digit : ");
        int d = sc1.nextInt();
        int res = count_digit(n,d);
        System.out.println("The result will be :"+res);


    }
    public static int count_digit(int n, int d) {

        if(n == 0){
            return 0;
        }

        if (n%10 == d){
            return 1 +count_digit(n/10, d);
        }
        else
            return count_digit(n/10, d);



        }
              }
