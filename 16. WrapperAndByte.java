public class WrapperAndByte{
    public static void main(String[] args){
        //Define a byte type variable x.
        byte x=100;
        //print valur of x.
        System.out.println("byte x = "+x);
        //Define a object b of Byte class.
        //Use 'valueOf()' function to initialize object 'b' it with x.
        //Convert primitive data type to object type.
        Byte b=Byte.valueOf(x);
        //print value of b
        System.out.println("Byte b = "+b);
        //convert object to primitive data type.
        //b to y. 
        byte y = b.byteValue();
        //print value of y.
        System.out.println("byte y = "+y);
    }
}