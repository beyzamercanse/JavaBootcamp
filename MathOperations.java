package VARIABLES;
public class MathOperations {

    //   !!!!!!!!!!!!!
    // command + / = // everything

    // AN OPERATION BETWEEN WHOLE NUMBERS WILL ALWAYS RETURN A WHOLE NUMBER
    // AN OPERATION BETWEEN DECIMALS WILL PRESERVE THE DECIMAL


    public static void main(String[] args) {
        int bagOfSweets1 = 5;
        int bagOfSweets2 =  10;

        long starsInMilkyWay = 25000000000L;
        long starsInAndromeda = 10000000000000L;

        double testScore = 6.7;
        double bonusMarks = 2.5;

        System.out.println("Fred and George collected " + bagOfSweets1 + bagOfSweets2 + " sweets");
        System.out.println("There are " + starsInMilkyWay + starsInAndromeda + " stars in the Milky Way and Andromeda galaxies.");
        System.out.println(" With bonus marks, Ron scored " + testScore + bonusMarks + " /10 on his potions test. Snape wasn't too thrilled. ");


        System.out.println("Fred has " + (bagOfSweets2 - bagOfSweets1) + " more sweets than George");
        System.out.println(" The Andromeda Galaxy has " +(starsInAndromeda - starsInMilkyWay )+ " more stars than the Milky Way");
        System.out.println(" Snape ended up removing marks. Ron actually scored " + (testScore - bonusMarks) + " on his potions test.");

        System.out.println("Fred and George used a special spell to multiply their sweets to: " + bagOfSweets2 * bagOfSweets1);
        System.out.println("nape made an error on his excel, accidentally multiplying Ron's score to: " +  testScore*bonusMarks/10  + " .");

        System.out.println("10 is an even number, since dividing 10 by 2 has a remainder of:   " + (10%2) );
        System.out.println("5 is an odd number, since dividing 5 by 2 has a remainder of:   " +(5%2));


        int counter = 0;
        counter++;
        counter++;
        counter++;
        counter++;
        System.out.println(counter);   // 4
        counter--;
        counter--;
        counter--;
        counter--;
        System.out.println(counter);   // -4


    }
    
}
