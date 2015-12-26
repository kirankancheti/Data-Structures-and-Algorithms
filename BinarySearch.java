import java.util.Scanner;


public class BinarySearch {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	       int n = in.nextInt();
	       // int n=6;
	        int[] ar = new int[n];
        for(int i=0;i<n;i++){
	            ar[i]=in.nextInt(); 
	         }
        
	        int low=0;int high=ar.length-1;int mid;
	        while(low<=high){
	        	mid=(low+high)/2;
	      //  System.out.println(mid);
	        //	System.out.println("inside loop");
	        	if(ar[mid]==s){
	        		System.out.println(mid);break;
	        	}
	        	else if (ar[mid]>s){
	        		high=mid;
	        		
	        	}
	        	else{
	        		low=mid+1;
	        	}
	        	
	        }
    }

}
