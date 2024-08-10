import java.util.Scanner;

public  class task6{
    public static void main(String[] args){
        System.out.print("Enter the base :");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.print("Enter the exponent :");
        int exp = sc.nextInt();
        System.out.println("The power of " + base + " is " + power(base, exp));

    }
    public static int power(int base, int exp){
        if(exp == 0) {
            return 1;
        }
            else
            return base*power(base, exp-1);
    }
}
