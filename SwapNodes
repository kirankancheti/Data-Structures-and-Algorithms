import java.util.Scanner;


public class SwapNodes {
	
	
	public void createNode(){
		
		Scanner scanner=new Scanner(System.in);
		int numberOfNodes=scanner.nextInt();
		 Node root=new Node(1);
		 int input1;int input2;Node leftChild=null,rightChild=null;
		for(int nodeNumber=1;nodeNumber<=numberOfNodes;nodeNumber++){
			leftChild=null;rightChild=null;
			input1=	scanner.nextInt();
			input2= scanner.nextInt();
			if(input1!=-1){
			leftChild=new Node(input1);}
			if(input2!=-1){
			rightChild=new Node(input2);}
			root=findNodeAndAtach(root, nodeNumber, leftChild, rightChild);
		}
		
		int numberOfSwaps=scanner.nextInt();int[] heightOfSwap=new int[numberOfSwaps];int heightOfTree=1;
		for(int swap=0;swap<numberOfSwaps;swap++){
			heightOfSwap[swap]=scanner.nextInt();}
		for(int swap=0;swap<numberOfSwaps;swap++){
			root=swapNodes(root,heightOfTree,heightOfSwap[swap]);
			inOrderTraversal(root);System.out.println();
		}

	}
	
	
	public Node swapNodes(Node root,int heightOfTree,int heightOfSwap){
		if(root==null){
			return null;
		}		
		if((heightOfTree==heightOfSwap)||(heightOfTree!=1&&(heightOfTree%heightOfSwap==0))){
			Node temp=root.right;
			root.right=root.left;
			root.left=temp;
		//	return root;
		}		
	root.left=	swapNodes(root.left, heightOfTree+1,heightOfSwap);
	root.right=	swapNodes(root.right, heightOfTree+1,heightOfSwap);
		return root;
	}
	
	public static void main(String[] args){
		SwapNodes swapNode=new SwapNodes();
		swapNode.createNode();
	//	swapNode.inOrderTraversal(root);
		
	}
	
	public void inOrderTraversal(Node root){
		if(root==null){
			return;
		}
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
	
		inOrderTraversal(root.right);
	}
	
	public Node findNodeAndAtach(Node root,int data,Node leftChild,Node rightChild){
		
		if(root==null){
			return null;
		}
		
		if(root.data==data){
			root.left=leftChild;
			root.right=rightChild;
			return root;
		}
		
root.left=	findNodeAndAtach(root.left,data,leftChild,rightChild);
root.right=	findNodeAndAtach(root.right,data,leftChild,rightChild);
		
		return root;
	}
	
	
	class Node{
		  int data;
		    Node left;
		    Node right;
		Node(int data){
			this.data=data;
		}
	} 

}
