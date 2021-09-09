package BOOLEANS;

public class IfElse {
    public static void main(String[] args){

        int grade = 65;
        grade++;
        grade++;
        grade++;

        if (grade>75)  {
            System.out.println("great job, you passed!");
        }
        else {
            System.out.println("you failed!");
        }

        if (false) {
            System.out.println("Hello"); //if statement true
        } else {
            System.out.println("Goodbye"); //else statement false
        }


        String sentence = "Lorem";
 
        if (!sentence.equals("Lorem")) {
            System.out.println("Hello");
        } else {
            System.out.println("Goodbye");
        }
        

    }
    
}
