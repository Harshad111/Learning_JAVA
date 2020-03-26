public class WrapperAndFloat{
    public static void main(String[ ] args){
        float a = 21.50f;
        Float b = Float.valueOf(a);
        float c = b.floatValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}