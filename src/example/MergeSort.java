package example;

/**
 * @author lperezp
 */
public class MergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        _MergeSort mergeSort = new _MergeSort();
        int arr[] = {5,26,12,6,1,4,7};
        int n = arr.length;

        System.out.println("Array original:");
        for (int ind = 0; ind < arr.length; ind++) {
            System.out.print(arr[ind] + " ");
        }

        System.out.println();

        System.out.println("Array ordenado:");
        mergeSort.sort(arr,0,n-1);
        mergeSort.print(arr);
    }    
}
