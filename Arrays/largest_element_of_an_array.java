public class largest_element_of_an_array {
    public static void main(String[] args) {
        int arr[] = {10,5,6,2,8};
        int maxelement = findlargestelement(arr);
        System.out.println("the largest element is : " + maxelement) ;
    }

    static int findlargestelement(int arr[]){
        if('arr == null || arr.length = 0'){
            throw new IllegalArgumentException("Array is empty or null");
        }

        int maxelement = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxelement){
                maxelement = arr[i];
            }
        }
        return maxelement;
    }
}
