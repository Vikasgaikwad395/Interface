
interface Calc{
	int a = 50;
	int b = 60;
	void add();
	void sub();
	void mul();
	void div();
	
	
}
public class Interface implements Calc{
	public void add(){
		System.out.println("Addition of a+b:-"+(a+b));
		
	}
		public void sub() {
			System.out.println("Substractin is :-"+(a-b));

			
		}
		
		public void mul() {
			
			System.out.println("Multiplication is :- "+(a*b));

		}
		
		public void div() {
			System.out.println("Division of (a/b):- "+(a/b));

		}
		public static void main(String[] args) {
			Interface i = new Interface();
			i.add();
			i.sub();
			i.mul();
			i.div();
			
		}
}

