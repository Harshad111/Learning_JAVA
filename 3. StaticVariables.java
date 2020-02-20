class StaticVariables{
	static int num;
	public static void main(String[] args){
		System.out.println("Main Method Invoked ...");
		System.out.println("num : "+StaticVariables.num);
		StaticVariables.method();
	}
	static{
		System.out.println("Static Block Invoked ...");
		System.out.println("num : "+StaticVariables.num);
	}
	static void method(){
		System.out.println("Static Method Invoked ...");
		System.out.println("num : "+StaticVariables.num);
	}
}