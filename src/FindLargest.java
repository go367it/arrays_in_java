import java.util.Scanner;

public class FindLargest {

    // function for finding the largest element
    public static void findLargest(int arr[]){
        int larges = Integer.MIN_VALUE;
        int i = 0;
        for(; i<arr.length; i++){
            if(arr[i] > larges){
                larges = arr[i];
            }
        }
        System.out.println(" largest element is: "+ larges);
    }

    // defining main function
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int i = 0;
        for(; i<n; i++){
            arr[i] = s.nextInt();
        }
        findLargest(arr);
    }
}
