import java.util.Scanner;

public class PrintAllPairs {

    // function printing all the pairs
    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(i<=arr.length-2){
                for(int j=i+1; j<arr.length; j++){
                    System.out.println(arr[i]+ " " +arr[j]);
                }
            }
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
        printPairs(arr);
    }
}
