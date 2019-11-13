/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author Moises
 */
public class _QuickSort {
    public static void sort(int vec[]){
        int N=vec.length;
        quick(vec, 0, N-1);
    }
        
    public static void quick(int vec[], int inicio, int fin){
        if(inicio>=fin) return;
        int pivote=vec[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
            while(elemIzq<=fin && vec[elemIzq]<pivote){
                elemIzq++;
            }
            while(elemDer>inicio && vec[elemDer]>=pivote){
                elemDer--;
            }
            if(elemIzq<elemDer){
                int temp=vec[elemIzq];
                vec[elemIzq]=vec[elemDer];
                vec[elemDer]=temp;
            }
        }
                
        if(elemDer>inicio){
                int temp=vec[inicio];
                vec[inicio]=vec[elemDer];
                vec[elemDer]=temp;
        }
        quick(vec, inicio, elemDer-1);
        quick(vec, elemDer+1, fin);
    }
        
    public static void print(int vec[]){
        for(int i=0;i<vec.length;i++){
            System.out.print(vec[i] + " ");
        }
    }
}
