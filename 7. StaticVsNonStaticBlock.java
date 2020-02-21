class StaticVsNonStaticBlock{
	//Staic Block.
	static{
		System.out.println("Static Block Invoked ...");
	}
	//Non static block runs every time when ever class takes places in memory
	//but static block always runs once.

	//NonStatic Block of class.
	{
		System.out.println("Non Static Block Invoked ...");
	}
	//Constructor of class.
	StaticVsNonStaticBlock(){
		System.out.println("Constructor Invoked ...");
	}
	//Main method of class.
	public static void main(String[] args){
		System.out.println("Main Method Invoked ...");
		new StaticVsNonStaticBlock();
		new StaticVsNonStaticBlock();
		new StaticVsNonStaticBlock();

	}
}