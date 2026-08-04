class Solution {
    public int search(int[] nums, int target) {
        int l=0;int r=0;
        int n=nums.length;
        int pivot= findPivot(nums);
        // if(nums[pivot]==target)return pivot;
        // System.out.print(pivot);
        if(pivot==0){
            l=0;
            r=n-1;
        }else if(nums[0]>target){
            l=pivot;
            r=n-1;
        }else{
            l=0;
            r=pivot-1;
        }
        while(l<=r){
            int mid=(l+r)/2;
            if(target<nums[mid]){
                r=mid-1;
            }else if(target>nums[mid]){
                l=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public int findPivot(int[] nums){
        int l=0;
        int r=nums.length-1;
        while(l<r){
            int mid=(l+r)/2;
            if(nums[mid]<nums[r]){
                r=mid;
            }else{
                l=mid+1;
            }
        }
        return l; 
    }
}
