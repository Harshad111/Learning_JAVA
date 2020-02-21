public class NonStaticMethods{
	void doSomething(){
		System.out.println("Inside doSomething Method ...");
	}
	public static void main(String args[]){
		System.out.println("Inside Main method ...");
		NonStaticMethods object = new NonStaticMethods();
		object.doSomething();
	}
}