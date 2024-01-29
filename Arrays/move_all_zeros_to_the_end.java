package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class move_all_zeros_to_the_end {

    static int[] movezeros(int n, int arr[]){
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        int n1 = temp.size();

        for(int i=0; i<n1; i++){
            arr[i] = temp.get(i);
        }

        for(int i=n1; i<n; i++){
            arr[i] = 0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n = 10;
        int ans[] = movezeros(n, arr);
        for(int i=0; i<n; i++){
            System.out.println(ans[i] + " ");
        }
        System.out.println(" ");
    }
}
