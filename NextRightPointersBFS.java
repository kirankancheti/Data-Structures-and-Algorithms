import java.util.LinkedList;
import java.util.Queue;

class TreeLinkNode {
      int val;
      TreeLinkNode left, right, next;
      TreeLinkNode(int x) { val = x; }
 }

public class NextRightPointersBFS {
    public void connect(TreeLinkNode root) {
        if(root==null){
            return;
        }
       Queue<TreeLinkNode> Q= BreadthFirstSearch(root);
       int numOfNodes=Q.size();
       int numberOfLevels=0;
       for(int i=0;i<numOfNodes+1;i++){
		int result=(int)Math.pow(2, i);
		if(result==numOfNodes+1){
		numberOfLevels=i;break;
		}
	}
  
       for(int i=0;i<numberOfLevels;i++){
           TreeLinkNode prev=null;
           for(int j=0;j<Math.pow(2,i);j++){
               
              TreeLinkNode temp= Q.remove();
              if(prev!=null&&temp!=null){
                  prev.next=temp;
              }
              prev=temp;
           }
       }
    }
    
    public Queue<TreeLinkNode> BreadthFirstSearch(TreeLinkNode root){
        
        Queue<TreeLinkNode> Q = new LinkedList<TreeLinkNode>();
        Queue<TreeLinkNode> result = new LinkedList<TreeLinkNode>();
        Q.add(root);
  
        while(!Q.isEmpty()){
            
            TreeLinkNode temp=Q.remove();
            result.add(temp);
            if(temp.left!=null){
                Q.add(temp.left);
            }
            if(temp.right!=null){
                Q.add(temp.right);
            }
        }
        
        return result;
    }
}