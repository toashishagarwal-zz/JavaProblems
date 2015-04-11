package corejava;

class Base {
	public static void baseMethod() {
		System.out.println("Inside base");
	}
}


class Derived extends Base{
	public void baseMethod() {
		System.out.println("");
	}
}

public class BaseDerived {

	public static void main(String[] args) {
		Base b = new Derived();
		b.baseMethod();
	}

}
