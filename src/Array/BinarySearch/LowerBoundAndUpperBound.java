package Array.BinarySearch;

public class LowerBoundAndUpperBound {

    // returns first index of target, if found
    // returns insertion index of target, if not found
    public int lowerBound(int[] arr,int target){
        if(arr.length==0)
            return 0;
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid = (i+j)/2;  // mid = i+ (j-i)/2

            if(arr[mid]>=target)
                j=mid-1;
            else
                i=mid+1;
        }
        return i;
        // i = insertionIndex || targetIndex
        // j = insertionIndex-1 || targetIndex-1
    }

    // returns first index of target, if found
    // returns insertion index of target, if not found
    public int lowerBound(int[] arr,int target,int i,int j){
        if(arr.length==0)
            return 0;

        while(i<=j){
            int mid = (i+j)/2;  // mid = i+ (j-i)/2

            if(arr[mid]>=target)
                j=mid-1;
            else
                i=mid+1;
        }
        return i;
        // i = insertionIndex || targetIndex
        // j = insertionIndex-1 || targetIndex-1
    }

    // returns last index of target, if found
    // returns insertion index of target, if not found
    public int upperBound(int[] arr,int target){
        if(arr.length==0)
            return 0;
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid = (i+j)/2;  // mid = i+ (j-i)/2

            if(arr[mid]<=target)
                i=mid+1;
            else
                j=mid-1;
        }
        return arr[Math.max(j,0)]==target?j:i;
        // i = insertionIndex || targetIndex+1
        // j = insertionIndex-1 || targetIndex
    }

    // returns last index of target, if found
    // returns insertion index of target, if not found
    public int upperBound(int[] arr,int target,int i,int j){
        if(arr.length==0)
            return 0;

        while(i<=j){
            int mid = (i+j)/2;  // mid = i+ (j-i)/2

            if(arr[mid]<=target)
                i=mid+1;
            else
                j=mid-1;
        }
        return arr[Math.max(j,0)]==target?j:i;
        // i = insertionIndex || targetIndex+1
        // j = insertionIndex-1 || targetIndex
    }
}
