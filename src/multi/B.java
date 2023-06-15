package multi;

public class B extends A {
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		
		System.out.println("B");
	}
	
	 @Override
	public void method() {
		// TODO Auto-generated method stub
		super.method();
		System.out.println("B-1");
	}
     
	  public static void main(String[] args) {
		B b = new B();
		b.display();
		b.method();
		
	}
}
