class ObjectReferenceInStaticBlock{
	static{
		ObjectReferenceInStaticBlock obj = new ObjectReferenceInStaticBlock();
		//print the address of obj...
		System.out.println("value of obj : "+obj);
	}
	public static void main(String[] args){
		System.out.println("Main method Invoked ...");
	}
}