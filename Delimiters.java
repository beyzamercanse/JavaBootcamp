import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); //input sistem tanimlama
        System.out.println("Enter two integers (on the same line)");
        int num1 = scan.nextInt(); //input 
        int num2 = scan.nextInt(); //input

        System.out.println("Enter two very big integers in the same line");
        long bignum1 = scan.nextLong();
        long bignum2 = scan.nextLong();
        
        System.out.println("Enter two decimals (on the same line)");
        double dec1 = scan.nextDouble();
        double dec2 = scan.nextDouble();

        System.out.println("Enter two text values (on the same line)");
        String text1 = scan.next();
        String text2 = scan.next();

        System.out.println("\tIntegers are: " + num1 + " " + num2);
        System.out.println("\tBIG Integers are: " + bignum1 + " " + bignum2);
        System.out.println("\tDecimals are: " + dec1 + " " + dec2);
        System.out.println("\tWords are: " + text1 + " " + text2);

        scan.close();


    }
    
}
