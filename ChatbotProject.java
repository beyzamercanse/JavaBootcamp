package VARIABLES;

import java.util.Scanner;

public class ChatbotProject {

    public static void main(String[] args){

        //set up scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello. Welcome to Beyza's JavaChatBot! ");

        // dont really have to add counter but I did just in case 

        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name =  scan.nextLine();
        counter++;

        System.out.println("\nHello, " +  name + "!  Nice to meet you. Where are you from?");
        String country = scan.nextLine();
        counter++;

        System.out.println("\nI heard it's beautoful in " + country + ",I am from a place called Oracle. ");
        System.out.println("How old are you?");
        int age = scan.nextInt();
        counter++;

        System.out.println("\nSo, you are " + age + "! That's cool, I am 450 years old.");
        System.out.println("it means I am " + (450/age) + " times older than you.");
        counter++;

        System.out.println("\nAnyways it's enough of me to talk. What is your most proficient programming language?");
        scan.nextLine(); /////// ***!!!!
        String language = scan.nextLine();
        counter++;

        System.out.println("\nOh  " + language + ", thats great.It was nice chatting with you " + name + ".I asked you " +counter+ " questions so far. I have to log off now. See ya!" );




    }
    
}
