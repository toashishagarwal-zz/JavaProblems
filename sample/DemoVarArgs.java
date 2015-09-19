package sample;

class SomeClass{ }

public class DemoVarArgs {
	public static void main(String[] args) {
		SomeClass[] array = new SomeClass[3];
		array[0] = new SomeClass();
		array[1] = new SomeClass();
		array[2] = new SomeClass();
		
		DemoVarArgs obj = new DemoVarArgs();
		obj.callMe(array);
	}
	
	public void callMe(SomeClass... args){
		System.out.println("Called. No of args are --> "+ args.length);
	}
}
