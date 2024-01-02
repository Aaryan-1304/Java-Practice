package Arrays;

public class second_largest_and_second_smallest_element_of_an_array {

    static int secondLargest( int[] a, int n){
        int largest = a[0];
        int slargest = -1;
        for(int i=0; i<n; i++){
            if(a[i]> largest){
                slargest = largest;
                largest = a[i];
            }
            else if(a[i] < largest && a[i] > slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }
    static int secondSmallest(int[] a, int n){
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE;
        for(int i=1; i<n; i++){
            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            }
            else if(a[i] != smallest && a[i] < ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 7, 5};
        int n = a.length;
        int slargest = secondLargest(a, n);
        int ssmallest = secondSmallest(a, n);

        System.out.println(slargest);
        System.out.println(ssmallest);

    }
}
