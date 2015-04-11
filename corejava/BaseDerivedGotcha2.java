package corejava;

class Base1{
	
	public void baseMethod() {
		System.out.println("Inside base");
	}
} 

class Derived1 {
	
	Base1 b = new Base1(){
		public void baseMethod() {
			System.out.println("Derived");
		}
	};
}

public class BaseDerivedGotcha2 {

	public static void main(String[] args) {
		Derived1 d = new Derived1();
		d.b.baseMethod();
	}
}
