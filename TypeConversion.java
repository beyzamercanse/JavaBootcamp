package VARIABLES;
public class TypeConversion {

    public static void main(String[] args){

        //DOUBLE TO INT CONVERSION

        double salary = 5833.33333;
        int roundedSalary = (int)salary;

        System.out.println("PERCY'S MONTHLY SALARY IS  $" + salary);
        System.out.println("PERCY'S NEW MONTHLY SALARY IS  $" + roundedSalary);

        //// NEW PROBLEM : 

        double sales = 24309.65; 
        double profit = 18562.18; 
        double refunds = 688.78; 
        double shipping = 1233.57; 

        System.out.println("This month, we made $ " + (int)sales + " in sales");
        System.out.println("Factoring in costs, we made $" +  (int)profit  + " in profit");
        System.out.println("The refunds are at a low $ " + (int)refunds + ", This is a good sign!");
        System.out.println("Shipping costs were high. We paid $" + (int)shipping + " in shipping");

    }
    
}
