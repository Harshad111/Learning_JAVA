class StaticObject{
	static StaticObject obj;
	static{
		System.out.println(obj);
		//This line also work same as the next line.
		//but it is good practice to diffrenciate static and non-static members of a class.
		//obj = new StaticObject();
		StaticObject.obj = new StaticObject();
	}
	public static void main(String args[]){
		//this line also produce same result as next line.
		//System.out.println(obj);
		System.out.println(StaticObject.obj);
	}
}