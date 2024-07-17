class OuterClass{
	void display(){
		System.out.println("This is outer class");
	

	class InnerClass{
		void display(){
			System.out.println("This is inner class");
		}
	}
	InnerClass inner =new InnerClass();
	inner.display();
	}
}
class lab1{
	public static void main(String[] args){
		OuterClass outer= new OuterClass();
		
		outer.display();
	
		
	}
}
	