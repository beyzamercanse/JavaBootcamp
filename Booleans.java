package BOOLEANS;
public class Booleans {

    public static void main(String[] args) {
        int chemistryGrade  =  95;
        int biologyGrade =  75;
        int englishGrade = 75;
        System.out.println(biologyGrade  != chemistryGrade);
        System.out.println(biologyGrade == englishGrade);

        String sentence1  = "I love this class";
        String sentence2 = "I love this class";
        String sentence3  =  "I love this class";
        System.out.println(sentence1.equals(sentence2));   //comparing string values!
        System.out.println(!sentence1.equals(sentence2));  //  !equals =  not equal to for String

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales>costs);

        ///  Dont confuse = and ==
        //  = sets a variable equal to a new value (val to val)
        // == compares two values and returns a boolean (val to bool)
        
    }
    
}
