package VARIABLES;
import java.util.Scanner;

// input section
public class Survey {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome, thank you for taking the survey.");

        int counter = 0;
        System.out.println("\nWhats your name?");
        String name = scan.nextLine();
        counter++;

        System.out.println("\nhow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();
        counter++;

        System.out.println("\nhow much money do you spend on fast food?");
        double foodPrice =  scan.nextDouble();
        counter++;

        System.out.println("\nhow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        counter++;

        System.out.println("\nhow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;

        System.out.println("\nThank you " + name +  " for answering all "  + counter + " questions. ");
        System.out.println("Your fast food expenses are " + (foodPrice/coffeePrice) + " times more expensive than your coffee expenses.");
        System.out.println("Weekly, you spend $" + (coffeeAmount*coffeePrice) + " on coffee.");
        System.out.println("Weekly, you spend $" + (foodAmount*foodPrice) + " on food.");
        // keeping scanner open is a memory leak so close it!

        scan.close();
    
    }
    
}
