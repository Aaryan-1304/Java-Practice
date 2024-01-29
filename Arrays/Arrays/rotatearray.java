package Arrays.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rotatearray {

    static int[] roatatearray(int arr[], int n){
        int temp = arr[0];
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Size of the array is: ");
        int size = in.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the number of rotations: ");
        int rotations = in.nextInt();

        System.out.println("Original Array: " + Arrays.toString(arr));

        for(int i=0; i<rotations; i++){
            arr = roatatearray(arr, size);
        }
        System.out.println("Array after " + rotations + " left rotations: " + Arrays.toString(arr));

        in.close();
    }
}
