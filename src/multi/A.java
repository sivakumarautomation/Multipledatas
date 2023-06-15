package multi;

public class A extends MultiLevel {

	  @Override
	public void display() {
		
		super.display();
		
		System.out.println("Child class");
		
	}
	  
	  @Override
	public void method() {
		 super.method();
		 System.out.println("Child");
	}
	  
	  public static void main(String[] args) {
		A a = new A();
		a.display();
		a.method();
	}
}
