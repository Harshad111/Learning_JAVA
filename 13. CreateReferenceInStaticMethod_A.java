public class CreateReferenceInStaticMethod_A{
	static CreateReferenceInStaticMethod_A object = new CreateReferenceInStaticMethod_A();
	static{
		//This line prints the address of object ...
		System.out.println(CreateReferenceInStaticMethod_A.object);
		//The address which our object is referencing is changed by calling this function.
		//Here we will allocate new memory location to object reference using static function. 
		CreateReferenceInStaticMethod_A.init();
	}
	public static void main(String[] args){
		//This line prints the updated address of object ...
		System.out.println(CreateReferenceInStaticMethod_A.object);
	} 
	static void init(){
		//this line allocate new memory location for object ...
		CreateReferenceInStaticMethod_A.object = new CreateReferenceInStaticMethod_A();
	}
}