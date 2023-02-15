package Array.TernarySearch;

public class TernarySearch {

    public int ternarySearch_Iterative(int[] arr,int target){
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            int mid1 = i+(j-i)/3;
            int mid2 = j-(j-i)/3;

            if(arr[mid1]==target){
                return mid1;
            }
            if(arr[mid2]==target){
                return mid2;
            }
            if(arr[mid1]>target){
                j=mid1-1;     // checking in first part (i -> mid1-1)
            }
            else if(arr[mid2]<target){
                i=mid2+1;     // checking in third part  (mid2+1 -> j)
            }
            else{             // checking in second part  (mid1+1 -> mid2-1)
                i=mid1+1;
                j=mid2-1;
            }
        }
        return -1;
    }

    public int ternarySearch_Recursive(int[] arr,int target,int i,int j){
        while(i<=j){
            int mid1 = i+(j-i)/3;
            int mid2 = j-(j-i)/3;

            if(arr[mid1]==target){
                return mid1;
            }
            if(arr[mid2]==target){
                return mid2;
            }
            if(arr[mid1]>target){
                return ternarySearch_Recursive(arr,target,i,mid1-1);
                // checking in first part (i -> mid1-1)
            }
            else if(arr[mid2]<target){
                return ternarySearch_Recursive(arr,target,mid2+1,j);
                // checking in third part  (mid2+1 -> j)
            }
            else{
                return ternarySearch_Recursive(arr,target,mid1+1,mid2-1);
                // checking in second part  (mid1+1 -> mid2-1)
            }
        }
        return -1;
    }
}
