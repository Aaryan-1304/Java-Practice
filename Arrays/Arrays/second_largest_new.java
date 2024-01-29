package Arrays;

import java.util.Arrays;
import java.util.Scanner;

class second_largest_new {
    static private void elements(int[] arr, int n){
        if(n == 0 || n == 1){
            System.out.println(-1);
        }
        Arrays.sort(arr);
        int second_smallest = arr[1];
        int second_largest = arr[n-2];
        System.out.println("Second smallest is: " + second_smallest);
        System.out.println("Second largest is: " + second_largest);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements for the array: ");

        for(int i=0; i<size; i++){
            arr[i] = in.nextInt();
        }

        in.close();
    }
}
