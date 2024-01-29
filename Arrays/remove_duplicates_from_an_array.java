package Arrays;

public class remove_duplicates_from_an_array {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = removeduplicates(arr);
        System.out.println("The array after removing duplicate elements is: ");
        for(int i=0; i<k; i++){
            System.out.println(arr[i] + " ");
        }
    }
    static int removeduplicates(int arr[]){
        int i=0;
        for(int j=1; j<arr.length; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
