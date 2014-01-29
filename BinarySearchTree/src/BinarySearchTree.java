public class BinarySearchTree {
	public BinarySearchTree() {
	}

	public Node buildTree(int[] sortedNumbers, int start, int end) {
		if (start > end)
			return null;

		int mid = (start + end) / 2;
		Node node = new Node(sortedNumbers[mid]);
		node.myLeft = buildTree(sortedNumbers, start, mid - 1);
		node.myRight = buildTree(sortedNumbers, mid + 1, end);

		return node;
	}

	public boolean isBalanced(Node root) {
		int maxLev = maxDepth(root);
		int minLev = minDepth(root);

		System.out.println("Max: " + maxLev);
		System.out.println("Min: " + minLev);
		
		if (maxLev - minLev <= 1) {
			return true;
		}
		return false;
	}

	public int maxDepth(Node node) {
		if (node == null)
			return 0;

		int left = maxDepth(node.myLeft);
		int right = maxDepth(node.myRight);
		
		return (left > right) ? (left + 1) : (right + 1);
	}
	
	public int minDepth(Node node) {
		if (node == null)
			return 0;
		
		int left = minDepth(node.myLeft);
		int right = minDepth(node.myRight);
		
		return (left < right) ? (left + 1) : (right + 1);
	}
	
	public boolean contains(Node node, int value) {
		boolean leftContains = false;
		boolean rightContains = false;
		
		if (node == null) return false;
		
		if (node.myValue == value) return true;
		
		leftContains = contains(node.myLeft, value);
		rightContains = contains(node.myRight, value);
		
		return (leftContains | rightContains);
	}
}
