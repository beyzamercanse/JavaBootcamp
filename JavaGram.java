package VARIABLES;
// creating a chatbox (ft input )

import java.util.Scanner;

public class JavaGram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, thank you for joining JavaGram!");

        int counter = 0;
        System.out.println("\nWhats your first name?");
        String firstName = scan.nextLine();
        counter++;

        System.out.println("\nWhats your last name?");
        String lastName = scan.nextLine();
        counter++;

        System.out.println("\nWhats your age?");
        int age = scan.nextInt();
        counter++;

        System.out.println("\nWhats your username?");
        String username = scan.nextLine();
        counter++;

        System.out.println("\nWhere is your city?");
        String city = scan.nextLine();
        counter++;

        System.out.println("\nWhere are you from?");
        String country = scan.nextLine();
        counter++;

        System.out.println("\nHERE IS THE " +  counter + " INFORMATION YOU ENTERED: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);


    }
    
}
