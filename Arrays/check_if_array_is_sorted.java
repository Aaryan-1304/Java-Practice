package Arrays;

import java.util.Scanner;

public class check_if_array_is_sorted {

    boolean isSorted(int n, int[] a){
        for(int i=1; i < n; i++){
            if(a[i] >= a[i-1]){
            }
            else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = in.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elements: ");
        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }
        check_if_array_is_sorted  arrayChecker = new check_if_array_is_sorted ();

        boolean sorted = arrayChecker.isSorted(size, arr);

        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }
}
