public class WrapperAndDouble{
    public  static void main(String[] args){
        //initialize variable a with double value 
        double a = 101.45;
        //primitive data type to object (wrapper class)
        Double b = Double.valueOf(a);
        //object to primitive data type.
        double c = b.doubleValue();
        //printing all variables and objects.
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}