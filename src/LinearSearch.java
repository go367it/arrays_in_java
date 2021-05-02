import java.util.Scanner;

public class LinearSearch {

    // function for finding the element
    public static int linearSearch(int arr[]){
        Scanner s = new Scanner(System.in);
        int index = -1;
        int find = s.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == find){
                index = i;
                break;
            }
        }
        return index;
    }

    // for printing result
    public static void printResult(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // defining main function
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt(); // for taking no.of arrays
        int result[] = new int[t];
        for(int i = 0; i<t; i++){
            int n = s.nextInt();
            int arr[] = new int[n];
            for(int j=0; j<n; j++){
                arr[j] = s.nextInt();
            }
            int index = linearSearch(arr); // storing the index returned by the function
            result[i] = index;
        }
        printResult(result); // for printing result
    }
}
