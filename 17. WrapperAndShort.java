public class WrapperAndShort{
    public static void main(String[] args){
        short a = 50;
        Short b = Short.valueOf(a);
        short c = b.shortValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}