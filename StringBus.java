package VARIABLES;

public class StringBus {

    public static void main(String[] args) {

        String sentence = "number of passengers: ";

        int passengers = 0;
        passengers += 9;
        System.out.println(sentence + passengers);
        passengers -= 5;
        System.out.println(sentence + passengers);
        passengers -= 4;
        System.out.println(sentence + passengers);
        System.out.println("end of shift!");

    }
    
}
