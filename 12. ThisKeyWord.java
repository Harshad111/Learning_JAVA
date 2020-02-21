class ThisKeyWord{
	int x;
	ThisKeyWord(){
		//this keyword refers to object name for current memory address.
		System.out.println(this);
		System.out.println(this.x);
	}
	public static void main(String[] args){
		//This program produce two different memory address for every allocation.
		new ThisKeyWord();
		new ThisKeyWord();
	}
}