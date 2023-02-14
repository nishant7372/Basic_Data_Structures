package Array.BinarySearch;

public class BinarySearch {
    public int binarySearch_Iterative(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;

        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }

    public int binarySearch_Iterative(int[] arr,int target,int i,int j){
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==target) {
                return mid;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return -1;
    }

    public int binarySearch_Recursive(int[] arr,int target,int i,int j){
        if(i>j)
            return -1;
        int mid = (i+j)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]>target)
            return binarySearch_Recursive(arr,target,i,mid-1);
        else
            return binarySearch_Recursive(arr,target,mid+1,j);
    }
}
