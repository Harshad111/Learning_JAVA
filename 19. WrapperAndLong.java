public class WrapperAndLong{
    public static void main(String[] args){
        long a = 1000;
        Long b = Long.valueOf(a);
        long c = b.longValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}