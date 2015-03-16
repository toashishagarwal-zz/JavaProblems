package trees;

public class CountBST {

	public static void main(String[] args) {
		System.out.println("No of BST that can be contructed with " + 1 + " elements is " + getNumberOfBST(1));
		System.out.println("No of BST that can be contructed with " + 2 + " elements is " + getNumberOfBST(2));
		System.out.println("No of BST that can be contructed with " + 3 + " elements is " + getNumberOfBST(3));
		System.out.println("No of BST that can be contructed with " + 4 + " elements is " + getNumberOfBST(4));
		System.out.println("No of BST that can be contructed with " + 5 + " elements is " + getNumberOfBST(5));
	}
	
	public static int getNumberOfBST(int noOfNodes) {
		if(noOfNodes == 0 || noOfNodes == 1) 
			return 1;
		else {
			int left = 0, right = 0, sum = 0;
			for(int i = 1; i<= noOfNodes; i++) {
				left = getNumberOfBST(i - 1);
				right = getNumberOfBST(noOfNodes - i);
				sum += left * right;
			}
			return sum;
		}
	}
}
