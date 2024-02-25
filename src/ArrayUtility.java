import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("\nEnter the "+(i+1)+" No : ");
            arr[i] = sc.nextInt();
            i++;
        }
        return arr;
    }
}
