class Solution {
    public boolean isSorted(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            
                if(arr[i]<=arr[i+1]){
                    continue;
                }
                else{
                   return false;
                }
            
         }
         return true;
    }
}
