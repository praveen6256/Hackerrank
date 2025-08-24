import java.util.*;
public class Sol {
    void leftrot(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        
    }
    void rightrot(int[] arr,int k){
        int n=arr.length;
         k=k%n;
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,0,n-1);
    }
    void reverse(int[] arr,int start,int end){
         while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Sol sol=new Sol();
    int[] arr={1,2,3,4,5};
    int k=2;
    sol.leftrot(arr,k);
    System.out.println(Arrays.toString(arr));
    int[] arr2 = {1, 2, 3, 4, 5};
    sol.rightrot(arr2,k);
    System.out.println(Arrays.toString(arr2));
    }
}
