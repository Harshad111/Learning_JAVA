public class WrapperAndCharacter{
    public static void main(String[] args){
        char a = 'a';
        Character b = Character.valueOf(a);
        char c = b.charValue();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}