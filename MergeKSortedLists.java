/**
 * Definition for singly-linked list.*/
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  
  
  }
 
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
         
        if(lists==null||lists.length==0) return null;
        if(lists.length==1) return lists[0];
        return MergeListsHelper(lists,0,lists.length-1);
        }
        
        public ListNode MergeListsHelper(ListNode[] lists,int start,int end){
            if(start==end)return lists[start];
            int mid=(start+end)/2;
            ListNode  left=MergeListsHelper(lists,start,mid);
            ListNode  right=MergeListsHelper(lists,mid+1,end);
            return mergeKLists(left,right);
            
        }
        
            public ListNode mergeKLists(ListNode l1,ListNode l2){
         ListNode result=null;
         ListNode temp=null;
         while(l1!=null&&l2!=null){
             
             if(l1.val<l2.val){
                 if(temp==null){
                 temp=l1;
                     result=temp;
                 }
                 else{
                   temp.next=l1;
                   temp=temp.next;
                 }
                 l1=l1.next;
                 temp.next=null;
             }
             else{
                  if(temp==null){
                 temp=l2;
                     result=temp;
                 }
                 else{
                   temp.next=l2;
                   temp=temp.next;
                 }
                 l2=l2.next;
                 temp.next=null;
             }
         }
         
         if(l1!=null){
               if(temp==null){
               
                   result=l1;
               }
               else{
            temp.next=l1;}
         }
         
         if(l2!=null){
             if(temp==null){
                 result=l2;
             }
             else{
             temp.next=l2;}
         }
         
        return result;
     }
    }
    
    