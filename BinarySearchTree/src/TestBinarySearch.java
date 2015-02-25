
public class TestBinarySearch {
	public static BinarySearchTree myBst = new BinarySearchTree();
	
	public static void main(String[] args) {

		int nums = 32;
		int numbers[] = new int[nums];
		for (int i=0; i < nums; i++) {
			numbers[i] = i+1;
		}
		
//		Node rootNode = myBst.buildTree(numbers, 0, nums-1 );
		Node rootNode = myBst.buildTree(numbers);
		if (myBst.isBalanced(rootNode)) {
			System.out.println("balanced");
		}
		else {
			System.out.println("Not balanced");
		}
		
		for (int i=0; i < 50; i++) {
			contains(rootNode, i);
		}

	}
	
	public static void contains(Node rootNode, int value) {
		if (myBst.contains(rootNode, value)) {
			System.out.println("Tree contains: " + value);
		}
		else {
			System.out.println("Tree does NOT contain: " + value);
		}
	}

}
