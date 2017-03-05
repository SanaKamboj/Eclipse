package Solutions;
import java.util.*;

public class LevelTreeTraversal {

	TreeNode root;
		
    public LevelTreeTraversal()
    {
        root = null;
    }
    
    void levelOrder(){
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	TreeNode temp;
    	queue.add(root);
    	while(!queue.isEmpty()){
    		temp = queue.poll();
    		System.out.print(temp.key + " ");
    		
    		if(temp.left != null)
    			queue.add(temp.left);
    		
    		if(temp.right != null)
    		queue.add(temp.right);
    	}
    	
    }
	
	public static void main(String args[]){
		LevelTreeTraversal tree = new LevelTreeTraversal();
		tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        
        System.out.println("Print Level Order:");
        tree.levelOrder();
            
	}
}

/*
void levelOrder(){
	int height = getHeight(root);
	int h;
	for (h = 1; h <= height; h++){ //From 1 to height inclusive!
		printLevelOrder(root, h);
	}
}

int getHeight(TreeNode root){
	if(root == null){
		return 0;
	}
	
	int lheight = getHeight(root.left);
	int rheight = getHeight(root.right);
	
	if(lheight > rheight){
		return (lheight + 1);
	}
	return (rheight + 1);
	
}

void printLevelOrder(TreeNode root, int level){
	if(root == null){
		return;
	}
	if(level == 1){
		System.out.print(root.key + " ");
	}
	printLevelOrder(root.left, level -1);
	printLevelOrder(root.right, level -1);
}
*/