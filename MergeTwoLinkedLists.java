
public class MergeTwoLinkedLists {
	public Node createList(){
		
		Node head=new Node(5);
	//	head.next=null;
		head.next=new Node(6);
		head.next.next=new Node(7);
		
		return head;
	}
	
	public Node createList2(){
		
		Node head=new Node(1);
	//	head.next=null;
		head.next=new Node(2);

		
		return head;
	}
	
	public void printList(Node head){
		while(head!=null){
			System.out.print(head.data+"	");
			head=head.next;
		}
		System.out.println();
	}
	
	public Node MergeLists(Node headA, Node headB){
		Node mergedList=null;	Node mergedListPointer=null;	Node temp=null;
		while(headA!=null&&headB!=null){
			if(headA.data>=headB.data){
				temp=headB;
				headB=headB.next;
				temp.next=null;		
			}
			else{
				temp=headA;
				headA=headA.next;
				temp.next=null;
				
			}
			
			if(mergedList==null){
				mergedList=temp;
				mergedListPointer=mergedList;
				}
				else{
					mergedListPointer.next=temp;
					mergedListPointer=mergedListPointer.next;
				}
			
		}
		
		while(headA!=null||headB!=null){
			if(headA!=null){
			 temp=headA;
			headA=headA.next;
			temp.next=null;
		}
			if(headB!=null){
				 temp=headB;
					headB=headB.next;
					temp.next=null;
			}			
			if(mergedList==null){
				mergedList=temp;
				mergedListPointer=mergedList;
				}
				else{
					mergedListPointer.next=temp;
					mergedListPointer=mergedListPointer.next;
				}
		}
		
		
		return mergedList;
	}
	
	public static void main(String[] args){
		MergeTwoLinkedLists mtl = new MergeTwoLinkedLists();
		Node head1=mtl.createList();
		mtl.printList(head1);
		Node head2=mtl.createList2();
		mtl.printList(head2);
		Node merged=mtl.MergeLists(head1, head2);
		mtl.printList(merged);
		
		
		
	}

}
