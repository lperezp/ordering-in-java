/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author lperezp
 */
public class QuickSort {
         public static void main(String[] args) {
            _QuickSort quickSort = new _QuickSort();
            int arr[] = {5,26,12,6,1,4,7};
            
            System.out.println("Vector original");
            quickSort.print(arr);
            quickSort.sort(arr);
            System.out.println("\nVector ordenado");
            quickSort.print(arr);
        }
}
