
public class MaximumSubarray {
	 public int maxSubArray(int[] nums) {
	      return  findMaxSubArray(nums,0,nums.length-1);
	    }
	    
	    
	    public int findMaxSubArray(int[] nums,int low,int high){
	        
	        if(low==high){
	            return nums[low];
	        }
	        
	        int mid=(low+high)/2;
	        
	        
	        
	        int left=findMaxSubArray(nums,low,mid);
	        int right=findMaxSubArray(nums,mid+1,high);
	        int crossover=findMaxCrossOver(nums,low,mid,high);
	        
	      return  Math.max(crossover,Math.max(left,right));
	        
	    }
	    
	    
	    public int findMaxCrossOver(int[] nums,int low,int mid,int high){
	        
	        Integer leftMax=null;
	         int leftsum=0;
	         for(int i=mid;i>=low;i--){
	             leftsum=leftsum+nums[i];
	             if(leftMax==null||leftMax<leftsum){
	                 leftMax=leftsum;
	             }
	         }
	         Integer rightMax=null;
	         int rightsum=0;
	         
	         for(int j=mid+1;j<=high;j++){
	             rightsum=rightsum+nums[j];
	             if(rightMax==null||rightMax<rightsum){
	                 rightMax=rightsum;
	             }
	         }
	         
	         if(leftMax==null){
	             leftMax=0;
	         }
	         if(rightMax==null){
	             rightMax=0;
	         }
	         
	         return (leftMax+rightMax);
	         
	    }

}
