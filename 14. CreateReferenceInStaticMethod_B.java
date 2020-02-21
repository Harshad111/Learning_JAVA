//In this program we have used return statement to allocate memory of an object using static method 
public class CreateReferenceInStaticMethod_B{
	static CreateReferenceInStaticMethod_B obj = new CreateReferenceInStaticMethod_B();
	static{
		System.out.println(CreateReferenceInStaticMethod_B.obj);
		//here we will allocate new memory for our object reference.
		CreateReferenceInStaticMethod_B.obj = CreateReferenceInStaticMethod_B.init();
	}
	static CreateReferenceInStaticMethod_B init(){
		return new CreateReferenceInStaticMethod_B();
	}
	public static void main(String[] args){
		System.out.println(CreateReferenceInStaticMethod_B.obj);
	}
}