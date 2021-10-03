interface Calculator{
	int x = 20;
	int y = 30;
	void add();
	void sub();
	void mul();
	void div();
	
	
}
public class MyCalculator implements Calculator{
 
	public void add() {
		System.out.println("Addition is = "+(x+y));
	}
	public void sub() {
		System.out.println("Substraction  is = "+(x-y));
	}
	public void mul() {
		System.out.println("Mutliplication is = "+(x*y));
	}
	public void div() {
		System.out.println("Division is = "+(x/y));
	}
	public static void main(String[] args) {
		MyCalculator m = new MyCalculator();
		m.add();
		m.sub();
		m.mul();
		m.div();
	}
}

