class Constructor{
	int num;
	//We can assign a value to a Non-Static Variable, it will work.
	//But a good Practice to use Constructor to assign values to every Non-static variable.
	Constructor(){
		num=100;
	}
	public static void main(String[] args){
		System.out.println("Main Method Invoked ...");
		Constructor c = new Constructor();
		System.out.println(c.num);
	}
}