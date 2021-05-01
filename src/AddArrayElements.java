import java.util.Scanner;

public class AddArrayElements {

    // function for printing the sum of all the elements in the array
    public static void printAddedElements(int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    // main function
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); // Scanner for taking input from the users
        int t = s.nextInt(); // for getting the no of times the user enter the arrays
        int i = 0; // initializing the array value
        // initializing a for loop for taking the input values multiple times
        for(;i<t;i++){
            int n = s.nextInt(); // for taking the limit of the array
            int arr[] = new int[n];
            int j = 0; // for updating the index value of the array
            // for taking the input of the array
            for(; j<n; j++){
                arr[j] = s.nextInt();
            }
            printAddedElements(arr, n); // calling the function and passing the values
        }
    }

}
