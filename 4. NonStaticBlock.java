class NonStaticBlock{
	public static void main(String[] args){
		System.out.println("Main Method Invoked ...");
		new NonStaticBlock();
	}
	{
		System.out.println("NonStatic Block Invoked ...");
	}
}