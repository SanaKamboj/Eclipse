/*http://www.programcreek.com/2013/02/leetcode-balanced-binary-tree-java/*/

package Solutions;

public class BTBalanced {
	
	TreeNode root;
	
	public static int getHeight(TreeNode root){
		if(root == null){
			return 0;
		}
		
		int lheight = getHeight(root.left);
		int rheight = getHeight(root.right);
		
		if(lheight == -1 || rheight == -1){
			return -1;
		}
		
		if(Math.abs(lheight - rheight) > 1){
			return - 1;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) +1;
	}
	
	public static boolean isBalanced(TreeNode root){
		if(root == null){
			return true;
		}
		
		if(getHeight(root) == -1){
			return false;
		}
		
		return true;
	}
	
	public static void main(String args[]){
		BTBalanced tree = new BTBalanced();
		tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);
        //tree.root.left.left.left = new TreeNode(8);
        
        if (BTBalanced.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
	}

}

/* O(N^2) version
public static int getHeight(TreeNode root){
	if(root == null){
		return 0;
	}
	return Math.max(getHeight(root.left), getHeight(root.right)) +1;
}

public static boolean isBalanced(TreeNode root){
	if(root == null){
		return true;
	}
	int heightdiff = getHeight(root.left) - getHeight(root.right);
	if(Math.abs(heightdiff) > 1){
		return false;
	}
	return isBalanced(root.left) && isBalanced(root.right);
}
*/
