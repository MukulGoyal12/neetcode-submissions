class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int eleRow=findRow(matrix,target);
        if(eleRow!=-1){
            return findElement(matrix,target,eleRow);
        }
        return false;
    }

    public int findRow(int[][] matrix, int target){
        int s=0;
        int e=matrix.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(target==matrix[mid][0])return mid;
            else if(target>matrix[mid][0]) s=mid+1;
            else e=mid-1;
        }
        return e;
    }

    public boolean findElement(int[][] matrix, int target,int row){
        int s=0;
        int e=matrix[0].length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(matrix[row][mid]==target)return true;
            else if(target>matrix[row][mid])s=mid+1;
            else e=mid-1;
        }
        return false;
    }
}
