public class WrapperAndInterger{
    public static void main(String[] args){
        int a = 100;
        Integer b = Integer.valueOf(a);
        int c = b.intValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}