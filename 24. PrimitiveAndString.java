public class PrimitiveAndString{
    public static void main(String[] args){
        byte a = 100;
        //toString() function converts any data type to string object.
        //parse<DataType> function converts any string object to <DataType> value.
        String s1 = Byte.toString(a);
        byte c = Byte.parseByte(s1);
        System.out.println("***** BYTE AND STRING *****");
        System.out.println("byte value = "+a);
        System.out.println("byte to string object = "+s1);
        System.out.println("String object to byte type = "+c);
        System.out.println();
        //***************************************************
        short d = 111;
        String s2 = Short.toString(d);
        short e = Short.parseShort(s2);
        System.out.println("***** SHORT AND STRNG *****");
        System.out.println("short value ="+d);
        System.out.println("short to String object = "+s2);
        System.out.println("String object to short type = "+e);
        System.out.println();
        //***************************************************
        int var1 = 500;
        String s3 = Integer.toString(var1);
        int var2 = Integer.parseInt(s3);
        System.out.println("***** INTEGER AND STRING *****");
        System.out.println("Integer data : "+var1);
        System.out.println("Integer to String : "+s3);
        System.out.println("String to int type : "+var2);
        System.out.println();
        //***************************************************
        long var3 = 55555;
        String s4 = Long.toString(var3);
        long var4 = Long.parseLong(s4);
        System.out.println("***** LONG AND STRING *****");
        System.out.println("Long Data : "+var3);
        System.out.println("Long to String : "+s4);
        System.out.println("String to long : "+var4);
        System.out.println();
        //***************************************************
        char var5 = 'A';
        String s5 = Character.toString(var5);
        //parseChar Function is not available in java.
        //here we have some other methos to convert string into characters.
        //the reson behind this " String is a collection of characters. "
        //String with single character is possible. 
        //But in a char variable multiple character of string is not possible.
        System.out.println("***** CHARACTER AND STRING *****");
        System.out.println("char data : "+var5);
        System.out.println("char to string : "+s5);
        System.out.println("String to char not possible.");
        System.out.println();
        //***************************************************
        float var6 = 54.45f;
        String s6 = Float.toString(var6);
        float var7 = Float.parseFloat(s6);
        System.out.println("***** FLOAT AND STRING *****");
        System.out.println("float data : "+var6);
        System.out.println("float to string : "+s6);
        System.out.println("string to float : "+var7);
        System.out.println();
        //***************************************************
        double var8 = 101.101;
        String s7 = Double.toString(var8);
        double var9 = Double.parseDouble(s7);
        System.out.println("***** DOUBLE AND STRING *****");
        System.out.println("DOUBLE data : "+var8);
        System.out.println("double to string : "+s7);
        System.out.println("string to double : "+var9);
        System.out.println();

    }
}