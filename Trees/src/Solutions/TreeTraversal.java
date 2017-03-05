package Solutions;

public class TreeTraversal {
	
	TreeNode root;
	
	void printPostOrder(TreeNode TreeNode){
		if(TreeNode == null)
			return;
		
		printPostOrder(TreeNode.left);
		printPostOrder(TreeNode.right);
		System.out.print(TreeNode.key + " ");
	}
	
	void printPreOrder(TreeNode TreeNode){
		if(TreeNode == null)
			return;
		
		System.out.print(TreeNode.key + " ");
		printPreOrder(TreeNode.left);
		printPreOrder(TreeNode.right);
	}
	
	void printInOrder(TreeNode TreeNode){
		if(TreeNode == null)
			return;
		
		printInOrder(TreeNode.left);
		System.out.print(TreeNode.key + " ");
		printInOrder(TreeNode.right);
	}
	
	void printInOrder(){
		printInOrder(root);
	}
	
	void printPreOrder(){
		printPreOrder(root);
	}
	
	void printPostOrder(){
		printPostOrder(root);
	}
	
	public static void main(String args[]){
		TreeTraversal tree = new TreeTraversal();
		tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        
        System.out.println("Inorder:");
        tree.printInOrder();
        
        System.out.println("\nPreorder:");
        tree.printPreOrder();
        
        System.out.println("\nPostorder:");
        tree.printPostOrder();
        
        
	}

}

