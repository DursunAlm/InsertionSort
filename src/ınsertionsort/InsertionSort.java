/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ınsertionsort;

/**
 *
 * @author alimdursun
 */
public class InsertionSort {

    /**
     * @param args the command line arguments
     */
    /*
     *
     *[7,3,5,8,2,9,4,15,6] dizisinin best case  7 , average case 2, worst case 6'dır
     *
     */
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;
            
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    
    static void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;++i){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int []dizi={22,27,16,2,18,6};
        InsertionSort ob=new InsertionSort();
        ob.sort(dizi);
        printArray(dizi);
    }
    
}
