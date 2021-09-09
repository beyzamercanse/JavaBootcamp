import java.util.Scanner;


public class Dealership {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //SCANNER = waits for user to enter a vlue
        System.out.println("Welcome to the Java dealership.\n");

        System.out.println(" .Select option 'a' to buy a car.");
        System.out.println(". Select option 'b' to sell a car.");
        String option = scan.nextLine(); // we dont use char because, input always comes as "STRING"!!!!!!!!!!
        switch(option) {
            case "a": System.out.println("you choose option " + option); break;
            case "b": System.out.println("you choose option " + option); break;
            default: System.out.println("invalid option");
        }
        scan.close(); //to avoid the memory leak

    } 
}

