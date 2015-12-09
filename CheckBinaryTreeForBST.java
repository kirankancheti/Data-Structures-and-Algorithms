






public class CheckBinaryTreeForBST {
	
	public Node createTree(){
		Node root=new Node(4);
	Node left=	root.left=new Node(2);
    Node right=    root.right=new Node(7);
    left.left=new Node(1);
    left.right=new Node(3);
    right.left=new Node(6);
    right.right=new Node(8);
		return root;
	}
	
	
	class Node{
		  int data;
		    Node left;
		    Node right;
		Node(int data){
			this.data=data;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + data;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (data != other.data)
				return false;
			return true;
		}
		private CheckBinaryTreeForBST getOuterType() {
			return CheckBinaryTreeForBST.this;
		}	
	}	
	
	
public boolean checkForBST(Node root,Integer min,Integer max){
	
	if(root==null){
		return true;
	}
	
	
	
	if(	checkForBST(root.left,min,root.data)
			&& 
			checkForBST(root.right,root.data,max)){
		if(min<root.data&&max>=root.data){
			return true;
		}
		else{
			return false;
		}
	}
	else{
		return false;
	}
	
	
}

 
 

	
 public static void main(String[] args){
	 CheckBinaryTreeForBST lca=new CheckBinaryTreeForBST();
	Node root= lca.createTree();
	     System.out.println(      lca.checkForBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

	
 }
 

}
