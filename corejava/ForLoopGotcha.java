package corejava;

public class ForLoopGotcha {

	public static void main(String[] args) {
		int i,j;
		for (i=0,j=0 ; j<1; ++j, i++) {
			System.out.println(i + " " + j);
		}
		System.out.println(i + " " + j);
	}
}
