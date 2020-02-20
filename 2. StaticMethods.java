class StaticMethods{
	public static void main(String[] args){
		System.out.println("Main Function Invoked ...");
		StaticMethods.method1();
		StaticMethods.method2();
	}
	static void method1(){
		System.out.println("Method 1 invoked");
	}
	static void method2(){
		System.out.println("Method 2 invoked");
        StaticMethods.method1();
	}
	static{
		System.out.println("Static Block Invoked ...");
		StaticMethods.method1();
	}
}