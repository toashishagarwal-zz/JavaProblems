package trees;

public class BinaryTree_CheckComplete {

	public static void main(String[] args) {
		final Node root = createBinaryTree();
		
		// Get the count of Nodes
		final int count = getNumberOfNodes(root);
		
		// Check if complete
		if(isCompleteBinaryTree(0, root, count))
			System.out.println(" Complete !! ");
		else 
			System.out.println(" Not Complete !! ");	
	}

	private static Node createBinaryTree() {
		final Node root = Node.getInstance(1);
		root.left = Node.getInstance(2);
		root.right = Node.getInstance(3);
		root.left.left = Node.getInstance(4);
		root.left.right = Node.getInstance(5);
		root.right.left = Node.getInstance(6);
		return root;
	}
	
	private static int getNumberOfNodes(final Node root) {
		if(root == null) 
			return 0;
		return (1 + getNumberOfNodes(root.left) + getNumberOfNodes(root.right)) ;
	}
	
	/* ***************************************************************************************
	 *  The real logic in this code is -
	 *  For a given node at index i, the left child will always be at (2*i + 1) position and
	 *  							 the right child will always be at (2*i + 2) position
	 * ***************************************************************************************/
	
	// Time Complexity --> O(n)
	// Space Complexity --> O(1)
	
	private static boolean isCompleteBinaryTree(int index, Node root, int count) {
		// If the tree is empty, its considered as complete
		if (root == null ) return true;
		
		// if the 'index' is >= number of nodes, means something is wrong 
		// and tree is incomplete
		
		if(index >= count)  return false; 
		
		return (isCompleteBinaryTree(2*index + 1, root.left , count) && 
				isCompleteBinaryTree(2* index + 2, root.right, count));
	} 
}
