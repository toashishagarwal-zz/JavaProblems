package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeOperations {

	public static void main(String[] args) {
		final Node root = createBinaryTree();
		
		System.out.println("The tree in inorder is - ");
		printInorder(root);
		
		System.out.println(" \nMax Depth is --> " + maxDepth(root));
		
		// Get the count of Nodes
		final int count = getNumberOfNodes(root);
		System.out.println(" Total Number of Nodes is --> " + count);
		
		// Check if complete
		if(isCompleteBinaryTree(0, root, count))
			System.out.println(" Complete !! ");
		else 
			System.out.println(" Not Complete !! ");	
		
		// Get Least Common Ancestor
		System.out.println(" LCA of 4,5 is --> " + leastCommonAncestor(root, 4, 5));
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
	
	private static void printInorder(final Node root) {
		if(root == null) return;
		printInorder(root.left);
		System.out.print(root.getKey() + ", ");
		printInorder(root.right);
	}
	
	private static int maxDepth(Node root){
		if(root == null) 
			return 0;
		else {
			int leftDepth = maxDepth(root.left);
			int rightDepth = maxDepth(root.right);
			if(leftDepth < rightDepth) 
				return rightDepth + 1;
			else 
				return leftDepth + 1;
		}
	}
	
	private static void getInorder(Node root, List<Integer> inorder) {
		if(root == null) 
			return;
		else {
			getInorder(root.left, inorder);
			inorder.add(root.getKey());
			getInorder(root.right, inorder);
		}
	}
	
	private static void getPostorder(Node root, List<Integer> postorder) {
		if(root == null) 
			return;
		else {
			getPostorder(root.left, postorder);
			getPostorder(root.right, postorder);
			postorder.add(root.getKey());
		}
	}
	
	private static int leastCommonAncestor(Node root, int node1, int node2) {
		
		// Find Inorder traversal
		List<Integer> inorder = new ArrayList<Integer>();
		getInorder(root, inorder);
		
		// Find postorder traversal
		List<Integer> postorder = new ArrayList<Integer>();
		getPostorder(root, postorder);
		
		int startIndex = inorder.indexOf(node1);
		int endIndex = inorder.indexOf(node2);
		int max = -1;
		for(int i = startIndex +1 ; i< endIndex ;i++) {
			int element = inorder.get(i);
			int index = postorder.indexOf(element);
			if(index > max) 
				max = index; 
		}
		return postorder.get(max);
	}
	
}
