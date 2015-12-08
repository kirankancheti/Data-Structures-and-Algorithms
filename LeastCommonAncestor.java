




public class LeastCommonAncestor {
	
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
		private LeatCommonAncestor getOuterType() {
			return LeatCommonAncestor.this;
		}
		
		
	}	
	
	

 public Node lca(Node root,Node v1,Node v2)
    {
	 
	 if(root==null){
		 return null;
	 }
	 

	Node left= lca(root.left,v1,v2);
	Node right= lca(root.right,v1,v2);
	 
	if(left!=null&&right!=null){
		return root;
	}
	
	if(root.equals(v1)){
		 return v1;
	 }
	 if(root.equals(v2)){
		 return v2;
	 }
	
	if(left==null){
		return right;
	}
	else{
		return left;
	}
	
    
    }
 
 

	
 public static void main(String[] args){
	 LeatCommonAncestor lca=new LeatCommonAncestor();
	Node root= lca.createTree();
	Node v1=lca.new Node(7);
	Node v2=lca.new Node(8);
	Node lcaNode=lca.lca(root,v1, v2);
	
	System.out.println(lcaNode.data);
	
 }
 

}
