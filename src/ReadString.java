import java.util.Scanner;

public class ReadString {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println();
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}
