package VARIABLES;

public class Decimals {

    public static void main(String[] args){
        double percentage = 55.7;
        System.out.println("In 2020, " + percentage  + " % of the world population is urban. ");

        long population =  7000000000L;
        double dividend = 35;
        double divisor = 7;
        int num1 = 25;
        int num2 = 12;

        System.out.println(dividend);
        System.out.println("In 2021, " + dividend + " percentage of the world got corona virus.");
        System.out.println("In 2021, " + population/dividend + " people in the world got corona virus."); //  long/double = 3.44E4
        System.out.println("In 2021, " + dividend/divisor + " new viruses will come out."); //  double/double = x.0
        System.out.println(num1/num2); // int/int = 25/12  = 2
    }  
}
