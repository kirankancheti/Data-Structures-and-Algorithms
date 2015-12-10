



public class SingleValuedSubtrees {
	
int numberOfSingleValuedSubtrees;
	public Node createTree(){
		Node root=new Node(5);
	Node left=	root.left=new Node(4);
    Node right=    root.right=new Node(5);
    left.left=new Node(4);
    left.right=new Node(4);
  //  right.left=new Node(6);
    right.right=new Node(5);
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
		private SingleValuedSubtrees getOuterType() {
			return SingleValuedSubtrees.this;
		}
		
	}
	
	
	
	public boolean numberOfSingleValuedSubTrees(Node root){
		
		
		if(root==null){
			return true; 
		}
		Boolean leftValue=false;Boolean rightValue=false;
		if(root.left!=null)
	{leftValue=	numberOfSingleValuedSubTrees(root.left);}else{
		leftValue=true;
	}
    if(root.right!=null)
    	rightValue=  numberOfSingleValuedSubTrees(root.right);else{
    		rightValue=true;
    	}
    
    if(root.left==null&&root.right==null){
    	numberOfSingleValuedSubtrees++;
    	return true;
    }
	
    
    if(leftValue==true&&rightValue==true){
    	if(root.left!=null&&root.right!=null){
    	if(root.data==root.left.data&&root.left.data==root.right.data){
    		numberOfSingleValuedSubtrees++;
    	return true;}
    	else{
    		return false;
    	}}
    	else if(root.left!=null&&root.right==null){
    		if(root.data==root.left.data){
        		numberOfSingleValuedSubtrees++;
        	return true;}
        	else{
        		return false;
        	}
    	}
    	else{if(root.data==root.right.data){
    		numberOfSingleValuedSubtrees++;
    	return true;}
    	else{
    		return false;
    	}
    		
    	}
    }
    else{
    	return false;	
    }
	
	}
	
	
	public static void main(String[] args){
		SingleValuedSubtrees singleValueTrees=new SingleValuedSubtrees();
		Node root=singleValueTrees.createTree();
		singleValueTrees.numberOfSingleValuedSubTrees(root);
		System.out.println("Count of Single Valued Subtrees is "+singleValueTrees.numberOfSingleValuedSubtrees);
	}
	

}
