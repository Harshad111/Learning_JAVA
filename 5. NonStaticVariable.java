class NonStaticVariable{
	int num;
	public static void main(String[] args){
		System.out.println("Main Method Invoked ...");
		//This line will give you an error
		// Error: "non-static variable num cannot be referenced from a static context"
		//System.out.println(NonStaticVariable.num);
		NonStaticVariable NSV = new NonStaticVariable();
		//This line will show '0' because num has not assigned any value.
		System.out.println(NSV.num);
		NSV.num=100;
		System.out.println(NSV.num);
	}
}