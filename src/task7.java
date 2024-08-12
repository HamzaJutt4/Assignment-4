import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String reversedstr = reverse(str,str.length());
        System.out.println("Simple String : "+ str );
        System.out.println("Reversed String : "+ reversedstr);

    }
    public static String reverse(String str,int length) {
        if(length<=1){
            return str;
        }
        return str.charAt(length - 1) + reverse(str.substring(1, length - 1), length - 2) + str.charAt(0);


    }
}