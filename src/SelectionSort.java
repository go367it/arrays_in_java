import java.util.Scanner;

public class SelectionSort {

    // function for sorting
    public static void selectSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int j=i+1;
            if(j <= arr.length-1){
                for(; j<arr.length; j++){
                    if(arr[i] > arr[j]){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    // main function
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        selectSort(arr);
    }
}
