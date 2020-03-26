public class WrapperAndBoolean{
    public static void main(String[] args){
        boolean a = true;
        Boolean b = Boolean.valueOf(a);
        boolean c = b.booleanValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}