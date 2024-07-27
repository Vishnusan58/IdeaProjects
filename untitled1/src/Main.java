import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("size of array");
        int n = input.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print(" Please enter the string");
            arr[i] = input.next();


        }
        System.out.println(Arrays.toString(arr));

    }
}