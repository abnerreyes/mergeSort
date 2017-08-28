
;

import java.util.*;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumno
 */
public class mainMergeSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
                int vec[]={10,15,40,1,4};
                System.out.println("Vector original");
                imprimirVector(vec);
                System.out.println("\nVector ordenado");
                ordenacionMergeSort(vec);
                imprimirVector(vec);
 
    
    }

    public static void imprimirVector(int vec[]){
                for(int i=0;i<vec.length;i++){
                        System.out.print(vec[i]+" ");
                }
        }

    public static void ordenacionMergeSort(int vec[]){
                if(vec.length<=1) return;
                int mitad= vec.length/2;
                int izq[]=Arrays.copyOfRange(vec, 0, mitad);
                int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
                ordenacionMergeSort(izq);
                ordenacionMergeSort(der);       
                combinarVector(vec, izq, der);
        }

    public static void combinarVector(int v[], int izq[],int der[]){
                int i=0;
                int j=0;
                for(int k=0;k<v.length;k++){
                        if(i>=izq.length){
                                v[k]=der[j];
                                j++;
                                continue;
                        }
                        if(j>=der.length){
                                v[k]=izq[i];
                                i++;
                                continue;
                        }
                        if(izq[i]<der[j]){
                                v[k]=izq[i];
                                i++;
                        }else{
                                v[k]=der[j];
                                j++;
                        }
                }
        }
}


