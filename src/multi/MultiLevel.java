package multi;

public class MultiLevel {
	
	
	public void display() {
		
		System.out.println("parent class");
		
	}
	
	public void method() {
		
		System.out.println("parent class method");
		
	}
	
	public static void main(String[] args) {
		MultiLevel m = new MultiLevel();
		m.display();
		m.method();
	}

}
