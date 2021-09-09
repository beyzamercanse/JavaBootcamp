public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "Turkish";

        if (chemistryGrade>75   && englishGrade>75 && language.equals("Turkish")) {  // ||or
            System.out.println("Congratz, you got the scholarship!");
        }
        else {
            System.out.println("You didnt  get the scholarship!");
        }




        if (chemistryGrade>75  || englishGrade>75 && language.equals("Turkish")) {  // ||or
            System.out.println("Congratz, you got the scholarship!");
        }
        else {
            System.out.println("You didnt  get the scholarship!");
        }




        int credits = 120;
        double GPA = 3.2;
        if (credits >=  126 && GPA >=  2.0) {
            System.out.println("You earned your diploma!");
        } else  {
            System.out.println("Sorry, you need at least 40 credits and a minimum GPA of 3.2");

        }
    }
}
