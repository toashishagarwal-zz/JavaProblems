package trees;

final class Node {
	private int key;
	Node left;
	Node right;
	
	private Node(final int value) {
		this.setKey(value);
		this.left = this.right = null;
	}
	
	public static Node getInstance(final int value) {
		final Node node = new Node(value);
		return node;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
}