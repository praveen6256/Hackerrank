class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        Arrays.sort(arr);
        int n=arr.length-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=arr[n])
            return arr[i];
            else
            continue;
        }
        return -1;
        
        
    }
}
